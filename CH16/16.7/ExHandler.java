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
//�����Լ����쳣������
class MyExHandler implements Thread.UncaughtExceptionHandler
{
	//ʵ��unchaughtException()�������÷����������̵߳�δ�����쳣
	public void uncaughtException(Thread t , Throwable e)
	{
		System.out.println(t + "�̳߳������쳣��" + e);
	}
}
public class ExHandler
{
	public static void main(String[] args)
	{
		//�������̵߳��쳣������
		Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
		int a = 5 / 0;
		System.out.println("��������������");
	}
}