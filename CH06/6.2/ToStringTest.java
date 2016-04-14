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
class Apple{
	private String color;
	private double weight;
	public Apple(){ }
	//提供有参数的构造器
	public Apple(String color , double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return this.weight;
	}
	
	public String toString()
	{
		return "一个苹果，颜色是：" + color + "，重量是：" + weight;
	}
}
public class ToStringTest
{
	public static void main(String[] args)
	{
		Apple a = new Apple("红色" , 5.68);
		//打印Apple对象
		System.out.println(a);
	}
}