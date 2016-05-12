/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-12  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.concurrent.locks.*;
public class Account 
{
	//显式定义Lock对象
	private final Lock lock = new ReentrantLock();
	//获得制定Lock对象对应的Condition
	private final Condition cond = lock.newCondition();
	//封装账户编号、账户余额两个Field
	private String accountNo;
	private double balance;
	//标识账户中是否已有存款的旗标
	private boolean flag = false;
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
	public synchronized void draw(double drawAmount)
	{
		//加锁
		lock.lock();
		try
		{
			//如果falg为假，表明账户中还没有人存钱进去，取钱方法阻塞
			if (!flag)
			{
				cond.await();
			}
			else
			{
				//执行取钱操作
				System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
				balance -= drawAmount;
				System.out.println("账户余额为：" + balance);
				//将标识账户是否已有存款的旗标设为false
				flag = false;
				//唤醒其他线程
				cond.signalAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		//使用finally块来释放锁
		finally
		{
			lock.unlock();
		}
	}
	public synchronized void deposit(double depositAmount)
	{
		lock.lock();
		try
		{
			//如果flag为真，表明账户中已有人存钱进去，存钱方法阻塞
			if (flag)
			{
				cond.await();
			}
			else
			{
				//执行存款操作
				System.out.println(Thread.currentThread().getName() + "存款：" + depositAmount);
				balance += depositAmount;
				System.out.println("账户余额为：" + balance);
				//将账户是否已有寸框的旗标设为true
				flag = true;
				//唤醒其他线程
				cond.signalAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
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