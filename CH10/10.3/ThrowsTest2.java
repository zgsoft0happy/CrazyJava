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
public class ThrowsTest2
{
	public static void main(String[] args) throws Exception
	{
		//因为test()方法声明抛出IOException异常
		//所以调用该方法的代码要么处于try...catch块中
		//要么处于另一个带throws声明抛出的方法中
		test();
	}
	public static void test() throws IOException
	{
		//因为FileInputSTream的构造器声明中抛出IOException异常
		//所以调用FileInputStream的代码要么处于try...catch块中
		//要么处于另一个带throws声明抛出的方法中
		FileInputStream fis = new FileInputStream("a.txt");
	}
}