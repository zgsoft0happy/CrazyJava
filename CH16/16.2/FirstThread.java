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
//通过继承Thread类来创建线程类
public class FirstThread extends Thread
{
	private int i ;
	//重写run()方法，run()方法的方法体就是线程执行体
	public void run()
	{
		for (; i < 100 ; i++)
		{
			//当线程类继承Thread类时，直接使用this即可获取当前线程
			//Thread对象的getName()放回当前线程的名字
			//因此可以直接调用getName()方法返回当前线程的名字
			System.out.println(getName() + " " + i);
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
				//创建并启动第一个线程
				new FirstThread().start();
				//创建并启动第二个线程
				new FirstThread().start();
			}
		}
	}
}