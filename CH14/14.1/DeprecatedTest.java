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
class Apple
{
	//定义info方法已过时
	@Deprecated
	public void info()
	{
		System.out.println("Apple的info方法");
	}
}
public class DeprecatedTest
{
	public static void main(String[] args)
	{
		//下面使用info方法时将会被编译器警告
		new Apple().info();
	}
}