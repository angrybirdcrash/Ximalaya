package ximalaya;

import com.alibaba.fastjson.JSON;

import bean.albuminfo.AlbumInfo;
import bean.trackinfo.TrackListInfo;
import util.WebUtil;

/**
 * 一页音轨列表的信息
 * 
 * @author Administrator
 *
 */
public class Ximalaya {
	private String albumId;
	private int currentPage;

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Ximalaya(String albumId) {
		this.albumId = albumId;
	}

	/**
	 * 一页音轨列表信息
	 * 
	 * @return
	 */
	public TrackListInfo getTrackListInfo() {
		String trackListInfoUrl = "https://www.ximalaya.com/revision/play/album?albumId=" + this.albumId + "&pageNum="
				+ this.currentPage + "&sort=0&pageSize=30";
		return JSON.parseObject(WebUtil.sendGet(trackListInfoUrl), TrackListInfo.class);
	}

	/**
	 * 专辑信息
	 */
	public AlbumInfo getAlbumInfo() {
		String albumInfoUrl = "https://www.ximalaya.com/revision/album?albumId=" + this.albumId;
		return JSON.parseObject(WebUtil.sendGet(albumInfoUrl), AlbumInfo.class);
	}
}
