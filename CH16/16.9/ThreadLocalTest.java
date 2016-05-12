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
class Account
{
	/*����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾�����
	ÿ���̶߳��ᱣ���ñ�����һ������*/
	private ThreadLocal<String> name = new ThreadLocal<>();
	//����һ����ʼ��name���ԵĹ�����
	public Account(String str)
	{
		this.name.set(str);
		//����������ڷ��ʵ�ǰ�̵߳�name������ֵ
		System.out.println("---" + this.name.get());
	}
	//name��setter��getter����
	public void setName(String str)
	{
		this.name.set(str);
	}
	public String getName()
	{
		return name.get();
	}
}
class MyTest extends Thread
{
	//����һ��Account����
	private Account account;
	public MyTest(Account account , String name)
	{
		super(name);
		this.account = account;
	}
	public void run()
	{
		//ѭ��10��
		for (int i = 0 ; i < 10 ; i++)
		{
			//��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
			if (i == 6)
			{
				account.setName(getName());
			}
			//���ͬһ���˻����˻�����ѭ������
			System.out.println(account.getName() + "�˻���iֵ��" + i);
		}
	}
}
public class ThreadLocalTest
{
	public static void main(String[] args)
	{
		//���������̣߳������̹߳���ͬһ��Account
		Account at = new Account("��ʼ��");
		/*
		��Ȼ�����̹߳���һ���˻�����ֻ��һ���˻���
		�������˻�����ThreadLocal���͵ģ�����ÿ���߳�
		����ȫӵ�и��Ե��˻��������������i == 6֮�󣬽���������
		�̷߳���ͬһ���˻�ʱ���ֲ�ͬ���˻���
		*/
		new MyTest(at , "�̼߳�").start();
		new MyTest(at , "�߳���").start();
	}
}