/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-11  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.concurrent.locks.*;
public class Account 
{
	//定义锁对象
	private final ReentrantLock lock = new ReentrantLock();
	//封装账户编号、账户余额两个Field
	private String accountNo;
	private double balance;
	public Account(){}
	//构造器
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
	//因为账户余额不允许随便修改，所以只为balance提供getter方法
	public double getBalance()
	{
		return this.balance;
	}
	//提供一个县城安全的draw()方法来完成取钱操作
	public synchronized void draw(double drawAmount)
	{
		//加锁
		lock.lock();
		try
		{
			//账户余额大于取钱数目
			if (balance >= drawAmount)
			{
				//吐出钞票
				System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
				try
				{
					Thread.sleep(1);
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				//修改余额
				balance -= drawAmount;
				System.out.println("\t余额为：" + balance);
			}else
			{
				System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
			}
		}
		finally
		{
			//修改完成，释放锁
			lock.unlock();
		}
	}
	//下面两个方法根据accountNo来重写hashCode()和equals()方法
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