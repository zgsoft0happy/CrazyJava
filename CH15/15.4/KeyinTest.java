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
public class KeyinTest
{
	public static void main(String[] args)
	{
		try(
			//将System.in对象转换成Reader对象
			InputStreamReader reader = new InputStreamReader(System.in);
			//将普通的Reader包装成BufferedReader
			BufferedReader br = new BufferedReader(reader))
		{
			String buffer = null;
			//采用循环方式来逐行地读取
			while ((buffer = br.readLine()) != null)
			{
				//如果读取的字符串为"exit"，则程序退出
				if (buffer.equals("exit"))
				{
					System.exit(1);
				}
				//打印读取的内容
				System.out.println("输入内容为：" + buffer);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}