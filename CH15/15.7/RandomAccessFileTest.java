/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-06  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class RandomAccessFileTest
{
	public static void main(String[] args)
	{
		try(
			RandomAccessFile raf = new RandomAccessFile("RandomAccessFileTest.java" , "r"))
		{
			//获取RandomAccessFile对象文件指针的位置，初始位置是0
			System.out.println("RandomAccessFile的文件指针的初始位置：" + raf.getFilePointer());
			//移动raf的文件记录指针的位置
			raf.seek(300);
			byte[] buff = new byte[1024];
			//用于保存实际读取的字节数
			int hasRead = 0;
			//使用循环来重复"取水"过程
			while ((hasRead = raf.read(buff)) > 0)
			{
				//取出"竹筒"中的水滴（字节），将字节数组转换成字符串输入
				System.out.println(new String(buff , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}