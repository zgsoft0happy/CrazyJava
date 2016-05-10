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
public class JoinThread extends Thread
{
	//提供一个有参数的构造器，用于设置该线程的名字
	public JoinThread(String name)
	{
		super(name);
	}
	//重写run()方法，定义线程执行体
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		//启动子线程
		new JoinThread("新线程").start();
		for(int i = 0 ; i < 100 ; i++)
		{
			if (i == 20)
			{
				JoinThread jt = new JoinThread("被Join的线程");
				jt.start();
				//main线程调用了jt线程的join()方法，main线程
				//必须等jt执行结束才会乡下执行
				jt.join();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}