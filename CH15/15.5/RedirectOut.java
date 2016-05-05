/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-05  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class RedirectOut
{
	public static void main(String[] args)
	{
		try(
			//一次性创建PrintStream输出流
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt")))
		{
			//将标准暑促重定向到ps输出流
			System.setOut(ps);
			//向标准输出输出一个字符串
			System.out.println("普通字符串");
			//向标准输出输出一个对象
			System.out.println(new RedirectOut());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}