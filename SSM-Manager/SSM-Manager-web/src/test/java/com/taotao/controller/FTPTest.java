package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.taotao.common.utils.FtpUtil;

public class FTPTest {
/*
	@Test
	public void testFtpClient() throws Exception {
		//创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接。默认是21端口
		ftpClient.connect("192.168.222.133", 21);
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("zt", "1234");
		//上传文件。
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\张涛\\Pictures\\B20980B1D9A10C7007DC4831F2AC0D25.jpg"));
		//设置上传的路径
		ftpClient.changeWorkingDirectory("/www/images");
        ftpClient.enterLocalPassiveMode();
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//第一个参数：服务器端文档名
		//第二个参数：上传文档的inputStream
		ftpClient.storeFile("zt.jpg", inputStream);
		//关闭连接
		ftpClient.logout();
		
	}

	
	@Test
	public void testFtpUtil() throws Exception {
		FileInputStream inputStream = new FileInputStream(new File("D:\\Documents\\Pictures\\images\\2010101415583352_S.jpg"));
		FtpUtil.uploadFile("192.168.25.133", 21, "ftpuser", "ftpuser", "/home/ftpuser/www/images", "/2015/09/04", "hello.jpg", inputStream);
		
	}*/

}
