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
public class ReadFromProcess
{
	public static void main(String[] args) throws IOException
	{
		//运行javac命令，返回运行该命令的子进程
		Process p = Runtime.getRuntime().exec("javac");
		try(
			//以p进程的错物流创建BufferedReader对象
			//这个错误流对本程序是输入流，对p进程则是输出流
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream())))
		{
			String buff = null;
			//采取循环方式来读取p进程的错误输出
			while ((buff = br.readLine()) != null)
			{
				System.out.println(buff);
			}
		}
		System.out.println("成功执行了");
	}
}