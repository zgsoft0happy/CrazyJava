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
public class Account 
{
	//��װ�˻���š��˻��������Field
	private String accountNo;
	private double balance;
	//��ʶ�˻����Ƿ����д������
	private boolean flag = false;
	public Account(){}
	//������
	public Account(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		return this.accountNo;
	}
	//��Ϊ�˻�����������޸ģ�����ֻΪbalance�ṩgetter����
	public double getBalance()
	{
		return this.balance;
	}
	public synchronized void draw(double drawAmount)
	{
		try
		{
			//���falgΪ�٣������˻��л�û���˴�Ǯ��ȥ��ȡǮ��������
			if (!flag)
			{
				wait();
			}
			else
			{
				//ִ��ȡǮ����
				System.out.println(Thread.currentThread().getName() + "ȡǮ��" + drawAmount);
				balance -= drawAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʶ�˻��Ƿ����д��������Ϊfalse
				flag = false;
				//���������߳�
				notifyAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	public synchronized void deposit(double depositAmount)
	{
		try
		{
			//���flagΪ�棬�����˻��������˴�Ǯ��ȥ����Ǯ��������
			if (flag)
			{
				wait();
			}
			else
			{
				//ִ�д�����
				System.out.println(Thread.currentThread().getName() + "��" + depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//���˻��Ƿ����д��������Ϊtrue
				flag = true;
				//���������߳�
				notifyAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	//����������������accountNo����дhashCode()��equals()����
	public int hashCode()
	{
		return accountNo.hashCode();
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == Account.class)
		{
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}