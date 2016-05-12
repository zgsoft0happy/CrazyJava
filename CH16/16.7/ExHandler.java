/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-12  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
//定义自己的异常处理器
class MyExHandler implements Thread.UncaughtExceptionHandler
{
	//实现unchaughtException()方法，该方法将处理线程的未处理异常
	public void uncaughtException(Thread t , Throwable e)
	{
		System.out.println(t + "线程出现了异常：" + e);
	}
}
public class ExHandler
{
	public static void main(String[] args)
	{
		//设置主线程的异常处理器
		Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
		int a = 5 / 0;
		System.out.println("程序正常结束！");
	}
}