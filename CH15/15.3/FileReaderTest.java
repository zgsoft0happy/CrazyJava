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
public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
		try(
			//创建字符输入流
			FileReader fr = new FileReader("FileReaderTest.java"))
		{
			//创建一个长度为32的"竹筒"
			char[] cbuf = new char[32];
			//用于保存实际读取的字符数
			int hasRead = 0;
			//使用循环来重复“取水”过程
			while ((hasRead = fr.read(cbuf)) > 0)
			{
				//取出“竹筒”中的水滴（字符），将字符数组转换成字符串输入！
				System.out.print(new String(cbuf , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}