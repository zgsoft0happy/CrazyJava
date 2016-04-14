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
public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("简单的info方法");
	}
	public static void main(String[] args)
	{
		//因为main方法时静态方法，而info时非静态方法
		//调用main方法的是该类本身，而不是该类的实例
		//因此省略的this无法只想有效的对象
		//info();
		
		new StaticAccessNonStatic().info();
	}
}