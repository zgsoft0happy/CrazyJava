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
public class InvokeRun extends Thread
{
	private int i;
	//��дrun()������run()�����ķ���������߳�ִ����
	public void run()
	{
		for ( ; i < 100 ; i++)
		{
			//ֱ�ӵ���run()����ʱ��Thread��this.getName()�Żص��Ǹö��������
			//�����ǵ�ǰ�̵߳�����
			//ʹ��Thread.currentThread().getName()���ǻ�ȡ��ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName() + " " + i);		//1
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
				//ֱ�ӵ����̶߳����run()����
				//ϵͳ����̶߳��󵱳���ͨ���󣬰�run()����������ͨ����
				//�����������д��벢�������������̣߳�����һ��ִ������run()����
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}
}