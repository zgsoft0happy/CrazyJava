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
//ʵ��Runnable�ӿ�������һ���򵥵��߳���
class MyThread implements Runnable
{
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "��iֵΪ��" + i);
		}
	}
}
public class ThreadPoolTest
{
	public static void main(String[] args) throws Exception
	{
		//����һ�����й̶��߳���(6)���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ�����߳�
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		//�ر��̳߳�
		pool.shutdown();
	}
}