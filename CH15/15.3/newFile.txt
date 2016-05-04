/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-04  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try(
			//创建字节输入流
			FileInputStream fis = new FileInputStream("FileOutputSTreamTest.java");
			//创建字节输出流
			FileOutputStream fos = new FileOutputStream("newFile.txt"))
		{
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			//循环从输入流中取出数据
			while ((hasRead = fis.read(bbuf)) > 0)
			{
				//每读取依次，即写入文件输出流，读了多少，就写多少
				fos.write(bbuf , 0 , hasRead);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}