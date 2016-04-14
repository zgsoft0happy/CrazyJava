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
public class MultiExceptionTest
{
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b ;
			System.out.println("您输入的两个数相除的结果是：" + c);
		}
		catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
		{
			System.out.println("程序发生了数组越界、数字格式异常、算术异常之一");
			//捕获多异常时，异常变量默认有final修饰
			//所以下面代码有错
			//ie = new ArithmeticException("test");	//1
		}
		catch (Exception e)
		{
			System.out.println("未知异常");
			//捕获一种类型的异常时，异常变量没有final修饰
			//所以下面代码完全正确
			e = new RuntimeException("test");	//2
		}
	}
}