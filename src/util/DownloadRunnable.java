package util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * 多线程下载执行类
 * 
 * @author Administrator
 *
 */
public class DownloadRunnable implements Runnable {
	private String url;
	private String folderPath;
	private String filename;

	public DownloadRunnable(String url, String folderPath, String filename) {
		super();
		this.url = url;
		this.folderPath = folderPath;
		this.filename = filename;
	}

	@Override
	public void run() {
		synchronized (DownloadRunnable.class) {
			File folder = new File(folderPath);
			if (folder.exists() == false) {
				folder.mkdirs();
			}
			try {
				System.out.println(Thread.currentThread().getName() + "  " + filename);
				FileUtils.copyURLToFile(new URL(url), new File(folderPath, filename));
				System.out.println(System.currentTimeMillis());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
