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
public class DepositThread extends Thread
{
	//模拟用户帐户
	private Account account;
	//当前存款线程所希望存的钱数
	private double depositAmount;
	public DepositThread(String name , Account account , double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}
	//重复执行100次存款操作
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			account.deposit(depositAmount);
		}
	}
}