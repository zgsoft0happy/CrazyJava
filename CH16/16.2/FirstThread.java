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
//ͨ���̳�Thread���������߳���
public class FirstThread extends Thread
{
	private int i ;
	//��дrun()������run()�����ķ���������߳�ִ����
	public void run()
	{
		for (; i < 100 ; i++)
		{
			//���߳���̳�Thread��ʱ��ֱ��ʹ��this���ɻ�ȡ��ǰ�߳�
			//Thread�����getName()�Żص�ǰ�̵߳�����
			//��˿���ֱ�ӵ���getName()�������ص�ǰ�̵߳�����
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			//����Thread��currentThread()������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20)
			{
				//������������һ���߳�
				new FirstThread().start();
				//�����������ڶ����߳�
				new FirstThread().start();
			}
		}
	}
}