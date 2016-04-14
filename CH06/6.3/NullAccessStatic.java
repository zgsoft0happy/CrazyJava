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
public class NullAccessStatic 
{
	private static void test()
	{
		System.out.println("static修饰的类方法");
	}
	public static void main(String[] args)
	{
		//定义一个NullAccessStatic变量，其值为null
		NullAccessStatic nas = null;
		//null对象调用所属类的静态方法
		nas.test();
	}
}