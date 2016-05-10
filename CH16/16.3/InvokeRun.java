/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-10  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
public class InvokeRun extends Thread
{
	private int i;
	//重写run()方法，run()方法的方法体就是线程执行体
	public void run()
	{
		for ( ; i < 100 ; i++)
		{
			//直接调用run()方法时，Thread的this.getName()放回的是该对象的名字
			//而不是当前线程的名字
			//使用Thread.currentThread().getName()总是获取当前线程的名字
			System.out.println(Thread.currentThread().getName() + " " + i);		//1
		}
	}
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			//调用Thread的currentThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20)
			{
				//直接调用线程对象的run()方法
				//系统会把线程对象当成普通对象，把run()方法当成普通方法
				//所以下面两行代码并不会启动两个线程，而是一次执行两个run()方法
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}
}