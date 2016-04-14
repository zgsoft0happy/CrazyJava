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
public class PersonTest
{
	public static void main(String[] args)
	{
		//定义一个Person类型的变量
		Person p;
		//通过new关键字调用Person类的构造器，返回一个Person实例
		//将该Person实例赋给p变量
		p = new Person();
		
		//调用p的name Field，直接为该Field赋值
		p.name = "李刚";
		//调用p的say方法，生命say方法时定义了一个形参
		//调用该方法必须为形参指定一个值
		p.say("Java语言很简单，学习很容易！");
		//直接输出p的name Field的值，将输出 李刚
		System.out.println(p.name);
	}
}