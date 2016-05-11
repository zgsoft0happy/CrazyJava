/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-11  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
class A
{
	public synchronized void foo(B b)
	{
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName() + "������Aʵ����foo����");	//1
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName() + " ��ͼ����Bʵ����last����");	//3
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("������A���last�����ڲ�");
	}
}
class B
{
	public synchronized void bar(A a)
	{
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName() + " ������Bʵ����bar����");	//2
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName() + " ��ͼ����Aʵ����last����");	//4
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("������B���last�����ڲ�");
	}
}
public class DeadLock implements Runnable
{
	A a = new A();
	B b = new B();
	public void init()
	{
		Thread.currentThread().setName("���߳�");
		//����a�����foo()����
		a.foo(b);
		System.out.println("���������߳�֮��");
	}
	public void run()
	{
		Thread.currentThread().setName("���߳�");
		//����b�����bar()����
		b.bar(a);
		System.out.println("�����˸��߳�֮��");
	}
	public static void main(String[] args)
	{
		DeadLock dl = new DeadLock();
		//��dlΪtarget�������߳�
		new Thread(dl).start();
		//����init()����
		dl.init();
	}
}