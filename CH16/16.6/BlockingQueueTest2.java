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
import java.util.concurrent.*;
class Producer extends Thread
{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		String[] strArr = new String[]
		{
			"Java",
			"Struts",
			"Spring"
		};
		for (int i = 0 ; i < 999999999 ; i++)
		{
			System.out.println(getName() + "生产者准备生产集合元素！");
			try
			{
				Thread.sleep(200);
				//尝试放入元素，如果队列已满，则线程被阻塞
				bq.put(strArr[i % 3]);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName() + "生产完成：" + bq);
		}
	}
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName() + "消费者准备消费集合元素！");
			try
			{
				Thread.sleep(200);
				//尝试取出元素，如果队列已空，则线程被阻塞
				bq.take();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName() + "消费完成:" + bq);
		}
	}
}
public class BlockingQueueTest2
{
	public static void main(String[] args)
	{
		//创佳绩一个容量为1的BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		//启动3个生产者线程
		new Producer(bq).start();
		new Producer(bq).start();		
		new Producer(bq).start();
		//启动一个消费者线程
		new Consumer(bq).start();		
	}
}