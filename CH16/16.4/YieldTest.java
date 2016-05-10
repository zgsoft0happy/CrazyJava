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
public class YieldTest extends Thread
{
	public YieldTest(String name)
	{
		super(name);
	}
	//定义run()方法作为线程执行体
	public void run()
	{
		for (int i = 0 ; i < 50 ; i++)
		{
			System.out.println(getName() + " " + i);
			//当i等于20时，使用yield()方法让当前线程让步
			if(i == 20)
			{
				Thread.yield();
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		//启动两个并发线程
		YieldTest yt1 = new YieldTest("高级");
		//将yt1线程设置成最高优先级
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();
		YieldTest yt2 = new YieldTest("低级");
		//将yt2线程设置成最低优先级
		yt2.setPriority(Thread.MIN_PRIORITY);
		yt2.start();
	}
}