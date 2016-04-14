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
public class KeyboardInTest
{
	public static void main(String[] args) throws Exception
	{
		//以System.in字节流为基础，创建一个BufferedReader对象
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//逐行读取键盘输入
		while ((line = br.readLine()) != null)
		{
			System.out.println("用户键盘输入是：" + line);
		}
	}
}