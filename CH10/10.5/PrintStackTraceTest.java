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
class SelfException extends RuntimeException
{
	SelfException(){}
	SelfException(String msg)
	{
		super(msg);
	}
}
public class PrintStackTraceTest
{
	public static void main(String[] args)
	{
		firstMethod();
	}
	public static void firstMethod()
	{
		secondMethod();
	}
	public static void secondMethod()
	{
		thirdMethod();
	}
	public static void thirdMethod()
	{
		throw new SelfException("自定义异常信息");
	}
}