/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-10  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
//ͨ��ʵ��Runnale�ӿ��������߳���
public class SecondThread implements Runnable
{
	private int i ; 
	//run()����ͬ�����߳�ִ����
	public void run()
	{
		for (; i < 100 ; i++)
		{
			//��ǰ�߳�ʵ��Runnale�ӿ�ʱ
			//������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()����
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
				//ͨ��new Thread(target , name)�����������߳�
				new Thread(st , "���߳�1").start();
				new Thread(st , "���߳�2").start();
			}
		}
	}
}