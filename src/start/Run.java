package start;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import bean.albuminfo.AlbumInfo;
import bean.trackinfo.TrackListInfo;
import bean.trackinfo.TracksAudioPlay;
import util.DownloadRunnable;
import ximalaya.Ximalaya;

public class Run {

	public static void main(String[] args) {
		long startTimeMillis = System.currentTimeMillis();
		System.out.println(startTimeMillis);
		// 专辑id
		String albumId = "19739466";
		// 保存位置
		String savePath = "D:\\TARGET_FOLDER";
		File folder = new File(savePath);
		if (folder.exists() == false) {
			folder.mkdirs();
		}
		// 获取信息
		Ximalaya ximalaya = new Ximalaya(albumId);
		AlbumInfo albumInfo = ximalaya.getAlbumInfo();
		String albumName = albumInfo.getData().getMainInfo().getAlbumTitle();
		String anchorName = albumInfo.getData().getAnchorInfo().getAnchorName();
		long anchorId = albumInfo.getData().getAnchorInfo().getAnchorId();
		int trackTotalCount = albumInfo.getData().getTracksInfo().getTrackTotalCount();
		// 开始下载
		System.out.println("start download!");
		System.out.println("trackTotalCount: " + trackTotalCount + ", albumName: " + albumName + ", albumId: " + albumId
				+ ", " + "anchorName: " + anchorName + ", anchorId" + anchorId);
		List<File> localFileList = new ArrayList<>();
		TrackListInfo trackListInfo;
		// 下到了第几个文件
		int count = 0;
		// 在文件名前面追加零
		String zero = "";
		// 音轨总数是几位数
		int trackAmountDigit = (trackTotalCount + "").length();
		// 多线程下载
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		do {
			trackListInfo = ximalaya.getTrackListInfo();
			ximalaya.setCurrentPage(ximalaya.getCurrentPage() + 1);
			List<TracksAudioPlay> audioList = trackListInfo.getData().getTracksAudioPlay();
			for (TracksAudioPlay audio : audioList) {
				int index = audio.getIndex();
				String trackName = audio.getTrackName();
				String src = audio.getSrc();
				int duration = audio.getDuration();
				// 在喜马拉雅FastDFS中的文件后缀名
				String fileSuffix = src.substring(src.lastIndexOf("."), src.length());
				// 当前文件名的位数
				int currentDigit = (count + 1 + "").length();
				// 总共要补的零的个数
				int zeroLength = trackAmountDigit - currentDigit;
				// 补零
				zero = "";
				for (int i = 0; i < zeroLength; i++) {
					zero += "0";
				}
				// 拼文件名
				String filename = zero + index + "_" + trackName + fileSuffix;
//				DownloadFile.download(src, savePath, filename);
				executorService.execute(new DownloadRunnable(src, savePath, filename));
				// 添加到本地文件列表中
				File file = new File(savePath + File.separator + filename);
				localFileList.add(file);
				count++;
				System.out.println(count + "/" + trackTotalCount + " "
						+ String.format("%.2f%% ", count * 1.0 / trackTotalCount * 100) + duration + "s "
						+ file.length() + "bytes " + filename + " " + src);
			}
			// 只要后面还有就一直下载到整个专辑全下完
		} while (trackListInfo.getData().getHasMore() == true);
		executorService.shutdown();
		System.out.println();
		System.out.println("Mission complete! cost: " + (System.currentTimeMillis() - startTimeMillis) + " ms");
		System.out.println(
				"albumName: " + albumName + ", anchorName: " + anchorName + ", trackTotalCount: " + trackTotalCount);
		long totalBytes = 0L;
		for (File file : localFileList) {
			totalBytes += file.length();
		}
		System.out.println("totalSize: " + totalBytes + "bytes");
	}
}
