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
public class StartDead extends Thread
{
	private int i;
	//��дrun()������run()�����ķ���������߳�ִ����
	public void run()
	{
		for ( ; i < 100 ; i++)
		{
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args)
	{
		//�����̶߳���
		StartDead sd = new StartDead();
		for (int i = 0 ; i < 300 ; i++)
		{
			//����Thread��currentThread()������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if ( i == 20)
			{
				//�����߳�
				sd.start();
				//�ж��������̵߳�isAlive()ֵ�����true
				System.out.println(sd.isAlive());
			}
			//���̴߳����½�����������״̬ʱ��isAlive()��������false
			//��i > 20ʱ�����߳̿϶��Ѿ��������ˣ����sd.isAlive()Ϊ��ʱ��
			//�Ǿ�������״̬
			if (i > 20 && !sd.isAlive())
			{
				//��ͼ�ٴ��������߳�
				sd.start();
			}
		}
	}
}