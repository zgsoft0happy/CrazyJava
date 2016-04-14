/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.io.*;
public class AutoCloseTest
{
	public static void main(String[] args) throws IOException
	{
		try (
			//声明、初始化两个可关闭的资源
			//try语句会自动关闭这两个资源
			BufferedReader br = new BufferedReader(
				new FileReader("AutoCloseTest.java"));
			PrintStream ps = new PrintStream(new
				FileOutputStream("a.txt")))
		{
			//使用两个资源
			System.out.println(br.readLine());
			ps.println("庄生晓梦迷蝴蝶");
		}
	}
}