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
public class DrawThread extends Thread
{
	//模拟用户帐户
	private Account account;
	//当前取钱线程所希望取得钱数
	private double drawAmount;
	public DrawThread(String name , Account account , double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	//当多个线程修改同一个共享数据时，将涉及数据安全问题
	public void run()
	{
		//账户余额大于取钱数目
		if (account.getBalance() >= drawAmount)
		{
			//吐出钞票
			System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
			/*
			try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException ex)
			{
				ex.printstackTrace();
			}
			*/
			//修改余额
			account.setBalance(account.getBalance() - drawAmount);
			System.out.println("\t余额为：" + account.getBalance());
		}
		else 
		{
			System.out.println(getName() + "取钱失败！余额不足！");
		}
	}
}