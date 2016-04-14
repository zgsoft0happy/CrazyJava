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
class StaticOut
{
	//定义一个静态内部类，不适用访问控制符
	//即同一个包中的其他类可访问该内部类
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("静态内部类的构造器");
		}
	}
}
public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		/*
		上面代码可改为如下两行代码：
		使用OuterClass.InnerClass的形式定义内部类变量
		StaticOut.StaticIn in;
		通过new来调用内部类构造器创建静态内部类实例
		in = new StaticOut.StaticIn();
		*/
	}
}