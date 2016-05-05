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
import java.util.Scanner;
public class RedirectIn
{
	public static void main(String[] args)
	{
		try(
			FileInputStream fis = new FileInputStream("REdirectIn.java"))
		{
			//将标准输入重定向到fis输入流
			System.setIn(fis);
			//使用System.in创建Scanner对象，用于获取标准输入
			Scanner sc = new Scanner(System.in);
			//增加下面一行只把回车作为分隔符
			sc.useDelimiter("\n");
			//判断是否还有下一个输入项
			while (sc.hasNext())
			{
				//输出输入项
				System.out.println("键盘输入的内容是：" + sc.next());
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}