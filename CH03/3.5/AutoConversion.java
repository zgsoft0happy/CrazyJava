/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class AutoConversion
{
	public static void main(String[] args)
	{
		int a = 6;
		//int类型可以自动转换为float类型
		float f = a;
		//下面将输出6.0
		System.out.println(f);
		//定义一个byte类型的整数变量
		byte b = 9;
		//下面代码将出错，byte类型不能自动类型转换为char类型
		//char c = b;
		//byte类型变量可以自动类型转换为double类型
		double d = b;
		//下面将输出9.0
		System.out.println(d);
	}
}