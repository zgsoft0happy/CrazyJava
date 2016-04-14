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
class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public void info()
	{
		System.out.println("此人名为：" + name);
	}
}
public class PrintObject
{
	public static void main(String[] args)
	{
		//创建一个Person对象，将之赋给p变量
		Person p = new Person("孙悟空");
		//打印p所引用的Person对象
		System.out.println(p);
	}
}