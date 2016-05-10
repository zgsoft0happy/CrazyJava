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
import java.util.concurrent.*;
//实现Callable接口来实现线程类
public class ThirdThread implements Callable<Integer>
{
	//实现call()方法，作为线程执行体
	public Integer call()
	{
		int i = 0;
		for ( ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "的循环变量i的值：" + i);
		}
		//call()方法可以有返回值
		return i;
	}
	public static void main(String[] args)
	{
		//创建Callable对象
		ThirdThread rt = new ThirdThread();
		//使用FutureTask来包装Callable对象
		FutureTask<Integer> task = new FutureTask<Integer>(rt);
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " 的循环变量i的值：" + i);
			if ( i == 20)
			{
				//实质还是以Callable对象来创建并启动线程
				new Thread(task , "有返回值的线程").start();
			}
		}
		try
		{
			//获取线程返回值
			System.out.println("子线程的返回值：" + task.get());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}