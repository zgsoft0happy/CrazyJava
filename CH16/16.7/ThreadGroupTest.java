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
class MyThread extends Thread
{
	//�ṩָ���߳����Ĺ�����
	public MyThread(String name)
	{
		super(name);
	}
	//�ṩָ���߳������߳���Ĺ�����
	public MyThread(ThreadGroup group , String name)
	{
		super(group , name);
	}
	public void run()
	{
		for(int i = 0 ; i < 20 ; i++)
		{
			System.out.println(getName() + "�̵߳�i����" + i);
		}
	}
}
public class ThreadGroupTest
{
	public static void main(String[] args)
	{
		//��ȡ���߳����ڵ��߳��飬���������߳�Ĭ�ϵ��߳���
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("���߳�������֣�" + mainGroup.getName());
		System.out.println("���߳����Ƿ��Ǻ�̨�߳��飺" + mainGroup.isDaemon());
		new MyThread("���߳�����߳�").start();
		ThreadGroup tg = new ThreadGroup("���߳���");
		tg.setDaemon(true);
		System.out.println("tg�߳����Ƿ��Ǻ�̨�߳��飺" + tg.isDaemon());
		MyThread tt = new MyThread(tg , "tg����̼߳�");
		tt.start();
		new MyThread(tg , "tg����߳���").start();
	}
}