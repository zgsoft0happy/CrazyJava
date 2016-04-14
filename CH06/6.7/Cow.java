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
public class Cow
{
	private double weight;
	//外部类的两个重载构造器
	public Cow(){}
	public Cow(double weight)
	{
		this.weight = weight;
	}
	//定义一个非静态内部类
	private class CowLeg
	{
		//非静态内部类的两个Field
		private double length;
		private String color;
		//非静态内部类的两个重载的构造器
		public CowLeg(){}
		public CowLeg(double length , String color)
		{
			this.length = length;
			this.color = color;
		}
		public void setLength(double length)
		{
			this.length = length;
		}
		public double getLength()
		{
			return this.length;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public String getColor()
		{
			return this.color;
		}
		//非静态内部类的实例方法
		public void info()
		{
			System.out.println("当前牛腿颜色是：" + color +"，高：" + length);
			//直接访问外部类的private修饰的Field
			System.out.println("本牛腿所在的奶牛重：" + weight);	//1
		}
	}
	public void test()
	{
		CowLeg cl = new CowLeg(1.12, "黑白相间");
		cl.info();
	}
	public static void main(String[] args)
	{
		Cow cow = new Cow(378.9);
		cow.test();
	}
}