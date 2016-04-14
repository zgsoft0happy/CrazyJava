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
public class DivTest
{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double div = a / b;
		//div的值将是1.6774193548387097
		System.out.println(div);
		//输出正无穷大：Infinity
		System.out.println("5除以0.0的结果是：" + 5 / 0.0);
		//输出负无穷大：-Infinity
		System.out.println("-5除以0.0的结果是：" + - 5 / 0.0);
		//下面代码将出现异常
		//java.lang.ArithmeticException: / by zero
		System.out.println("-5除以0的结果是：" + - 5 / 0);
	}
}