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
public class DaemonThread extends Thread
{
	//�����̨�̵߳��߳�ִ��������ͨ�߳�û���κ�����
	public void run()
	{
		for (int i = 0 ; i < 1000 ; i++)
		{
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args)
	{
		DaemonThread t = new DaemonThread();
		//�����߳����óɺ�̨�߳�
		t.setDaemon(true);
		//������̨�߳�
		t.start();
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		//-����ִ�е��˴���ǰ̨�߳�(main�߳�)����----
		//��̨�߳�ҲӦ����֮����
	}
}