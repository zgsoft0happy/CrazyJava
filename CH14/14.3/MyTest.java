/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.lang.annotation.*;
public class MyTest
{
	//使用@Testable标记注释指定该方法是可测试的
	@Testable
	public static void m1()
	{}
	public static void m2()
	{}
	@Testable
	public static void m3()
	{
		throw new RuntimeException("Boom");
	}
	public static void m4()
	{}
	@Testable
	public static void m5()
	{}
	public static void m6()
	{}
	@Testable
	public static void m7()
	{
		throw new RuntimeException("Crash");
	}
	public static void m8()
	{}	
}