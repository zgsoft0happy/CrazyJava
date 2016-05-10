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
import java.util.concurrent.*;
//ʵ��Callable�ӿ���ʵ���߳���
public class ThirdThread implements Callable<Integer>
{
	//ʵ��call()��������Ϊ�߳�ִ����
	public Integer call()
	{
		int i = 0;
		for ( ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "��ѭ������i��ֵ��" + i);
		}
		//call()���������з���ֵ
		return i;
	}
	public static void main(String[] args)
	{
		//����Callable����
		ThirdThread rt = new ThirdThread();
		//ʹ��FutureTask����װCallable����
		FutureTask<Integer> task = new FutureTask<Integer>(rt);
		for (int i = 0 ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ��" + i);
			if ( i == 20)
			{
				//ʵ�ʻ�����Callable�����������������߳�
				new Thread(task , "�з���ֵ���߳�").start();
			}
		}
		try
		{
			//��ȡ�̷߳���ֵ
			System.out.println("���̵߳ķ���ֵ��" + task.get());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}