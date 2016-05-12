/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-12  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
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
			System.out.println(getName() + "������׼����������Ԫ�أ�");
			try
			{
				Thread.sleep(200);
				//���Է���Ԫ�أ�����������������̱߳�����
				bq.put(strArr[i % 3]);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName() + "������ɣ�" + bq);
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
			System.out.println(getName() + "������׼�����Ѽ���Ԫ�أ�");
			try
			{
				Thread.sleep(200);
				//����ȡ��Ԫ�أ���������ѿգ����̱߳�����
				bq.take();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName() + "�������:" + bq);
		}
	}
}
public class BlockingQueueTest2
{
	public static void main(String[] args)
	{
		//���Ѽ�һ������Ϊ1��BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		//����3���������߳�
		new Producer(bq).start();
		new Producer(bq).start();		
		new Producer(bq).start();
		//����һ���������߳�
		new Consumer(bq).start();		
	}
}