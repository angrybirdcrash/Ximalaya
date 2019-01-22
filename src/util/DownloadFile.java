package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 下载文件
 * 
 * @author Administrator
 *
 */
public class DownloadFile {

	/**
	 * 下载文件
	 * 
	 * @param url
	 * @param folderPath
	 * @param filename
	 */
	public static void download(String url, String folderPath, String filename) {
		try {
			int b = 0;
			URLConnection connection = new URL(url).openConnection();
			InputStream inputStream = connection.getInputStream();
			FileOutputStream fOutputStream = new FileOutputStream(folderPath + File.separator + filename);
			byte[] buffer = new byte[1204];
			while ((b = inputStream.read(buffer)) != -1) {
				fOutputStream.write(buffer, 0, b);
			}
			fOutputStream.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
