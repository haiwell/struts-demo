package com.struts.base.http;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 
 * 从服务器端获取内容
 * 
 * @author Administrator
 *
 */

public class HttpUtil {
	private static String BASE_PATH = "Http://192.168.1.102:8080/strutsDemo/base/images/test.jpg";

	public HttpUtil() {
		// TODO Auto-generated constructor stub
	}

	public static InputStream getInputStream() {
		InputStream inputStream = null;
		HttpURLConnection httpURLConnection = null;
		try {
			URL url = new URL(BASE_PATH);
			if (url != null) {
				httpURLConnection = (HttpURLConnection) url.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.setDoInput(true);
				httpURLConnection.setRequestMethod("GET");
				int responseCode = httpURLConnection.getResponseCode();
				if (responseCode == 200) {
					inputStream = httpURLConnection.getInputStream();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return inputStream;
	}

	public static void saveToDisk() {
		InputStream inputStream = getInputStream();
		FileOutputStream fileOutputStream = null;
		byte data[] = new byte[1024];
		int len = 0;
		try {
			fileOutputStream = new FileOutputStream("C://test.jpg");
			while ((len = inputStream.read(data)) != -1) {
				fileOutputStream.write(data, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveToDisk();
	}

}
