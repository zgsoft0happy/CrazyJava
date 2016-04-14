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
public enum Operation
{
	PLUS, MINUS, TIMES, DIVIDE;
	//为枚举类定义一个方法，用于实现不同的运算
	double eval(double x , double y)
	{
		switch (this)
		{
			case PLUS: return x + y;
			case MINUS: return x - y;
			case TIMES: return x * y;
			case DIVIDE: return x / y;
			default: return 0;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(Operation.PLUS.eval(3,4));
		System.out.println(Operation.MINUS.eval(3,4));
		System.out.println(Operation.TIMES.eval(3,4));
		System.out.println(Operation.DIVIDE.eval(3,4));
	}
}