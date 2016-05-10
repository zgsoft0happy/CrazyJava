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
//通过实现Runnale接口来创建线程类
public class SecondThread implements Runnable
{
	private int i ; 
	//run()方法同样是线程执行体
	public void run()
	{
		for (; i < 100 ; i++)
		{
			//当前线程实现Runnale接口时
			//如果想获取当前线程，只能用Thread.currentThread()方法
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20)
			{
				SecondThread st = new SecondThread();	//1
				//通过new Thread(target , name)方法创建新线程
				new Thread(st , "新线程1").start();
				new Thread(st , "新线程2").start();
			}
		}
	}
}