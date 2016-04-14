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
public class Apple
{
	public String name;
	public String color;
	public double weight;
	public Apple()
	{
	}
	//两个参数的构造器
	public Apple(String name,String color)
	{
		this.name = name;
		this.color = color;
	}
	//三个参数的构造器
	public Apple(String name, String color, double weight)
	{
		//通过this调用另一个重载的构造器的初始化代码
		this(name, color);
		//下面this引用该构造器正在初始化的Java对象
		this.weight = weight;
	}
}