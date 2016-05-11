/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-11  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.concurrent.locks.*;
public class Account 
{
	//����������
	private final ReentrantLock lock = new ReentrantLock();
	//��װ�˻���š��˻��������Field
	private String accountNo;
	private double balance;
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
	//�ṩһ���سǰ�ȫ��draw()���������ȡǮ����
	public synchronized void draw(double drawAmount)
	{
		//����
		lock.lock();
		try
		{
			//�˻�������ȡǮ��Ŀ
			if (balance >= drawAmount)
			{
				//�³���Ʊ
				System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ����³���Ʊ��" + drawAmount);
				try
				{
					Thread.sleep(1);
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				//�޸����
				balance -= drawAmount;
				System.out.println("\t���Ϊ��" + balance);
			}else
			{
				System.out.println(Thread.currentThread().getName() + "ȡǮʧ�ܣ����㣡");
			}
		}
		finally
		{
			//�޸���ɣ��ͷ���
			lock.unlock();
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