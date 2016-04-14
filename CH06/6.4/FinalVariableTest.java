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
public class FinalVariableTest
{
	//定义成员变量时制定默认值，合法
	final int a = 6;
	//下面变量将在构造器或初始化块中分配初始值
	final String str;
	final int c;
	final static double d;
	//既没有制定默认值，有没有在初始化块/构造器中制定初始值
	//下面定义char Field是不合法的
	//final char ch;
	//初始化块，可对没有制定默认值的实例Field制定初始值
	{
		//在初始化块中为实例Field制定初始值，合法
		str = "Hello";
		//定义a Field 时已经制订了默认值
		//不能为a重新赋值，下面赋值语句非法
		//a = 9;
	}
	//静态初始化块，客队没有指定默认值的类Field指定初始值
	static 
	{
		//在静态初始化中为类Field指定初始值，合法
		d = 5.6;
	}
	//构造器，可对即没有制定默认值，又没有在初始化块中
	//指定初始值的实例Field制定初始值
	public FinalVariableTest()
	{
		//如果初始化块中队str在指定了初始值
		//则构造器中不能对final变量重新复制，下面赋值语句非法
		//str = "java";
		c = 5;
	}
	public void changeFinal()
	{
		//普通方法不能为final修饰的成员变量赋值
		//d = 1.2;
		//不能再普通方法中卫final成员变量制定初始值
		//ch = 'a';
	}
	public static void main(String[] args)
	{
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}
}