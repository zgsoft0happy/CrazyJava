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
public class JoinThread extends Thread
{
	//�ṩһ���в����Ĺ��������������ø��̵߳�����
	public JoinThread(String name)
	{
		super(name);
	}
	//��дrun()�����������߳�ִ����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		//�������߳�
		new JoinThread("���߳�").start();
		for(int i = 0 ; i < 100 ; i++)
		{
			if (i == 20)
			{
				JoinThread jt = new JoinThread("��Join���߳�");
				jt.start();
				//main�̵߳�����jt�̵߳�join()������main�߳�
				//�����jtִ�н����Ż�����ִ��
				jt.join();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}