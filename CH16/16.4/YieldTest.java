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
public class YieldTest extends Thread
{
	public YieldTest(String name)
	{
		super(name);
	}
	//����run()������Ϊ�߳�ִ����
	public void run()
	{
		for (int i = 0 ; i < 50 ; i++)
		{
			System.out.println(getName() + " " + i);
			//��i����20ʱ��ʹ��yield()�����õ�ǰ�߳��ò�
			if(i == 20)
			{
				Thread.yield();
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		//�������������߳�
		YieldTest yt1 = new YieldTest("�߼�");
		//��yt1�߳����ó�������ȼ�
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();
		YieldTest yt2 = new YieldTest("�ͼ�");
		//��yt2�߳����ó�������ȼ�
		yt2.setPriority(Thread.MIN_PRIORITY);
		yt2.start();
	}
}