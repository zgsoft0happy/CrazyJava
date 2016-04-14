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
public enum Operation2
{
	PLUS
	{
		public double eval(double x , double y)
		{
			return x + y;
		}
	},
	MINUS
	{
		public double eval(double x , double y)
		{
			return x - y;
		}
	},
	TIMES
	{
		public double eval(double x , double y)
		{
			return x * y;
		}
	},
	DIVIDE
	{
		public double eval(double x , double y)
		{
			return x / y;
		}
	};
	//为枚举类定义一个抽象方法
	//这个抽象方法由不同的枚举值提供不同的实现
	public abstract double eval(double x , double y);
	public static void main(String[] args)
	{
		System.out.println(Operation2.PLUS.eval(3 , 4));
		System.out.println(Operation2.MINUS.eval(5 , 4));
		System.out.println(Operation2.TIMES.eval(5 , 4));
		System.out.println(Operation2.DIVIDE.eval(5 , 4));
	}
}