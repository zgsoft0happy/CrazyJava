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
public class InnerNoStatic
{
	private class InnerClass
	{
		/*
		下面三个静态声明都引发如下编译错误：
		非静态内部类不能有静态声明
		*/
		static
		{
			System.out.println("===========");
		}
		private static int inProp;
		private static void test(){}
	}
}