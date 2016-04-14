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
public class Person
{
	//下面按定义一个初始化块
	{
		int a = 6;
		//在初始化块中
		if (a > 4)
		{
			System.out.println("Person初始化块：局部变量a的值大于4");
		}
		System.out.println("Person的初始化块");
	}
	//定义第二个初始化块
	{
		System.out.println("Person的第二个初始化块");
	}
	//定义无参数的构造器
	public Person()
	{
		System.out.println("Person类的无参数构造器");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}