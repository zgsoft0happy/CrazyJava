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
public class DrawThread extends Thread
{
	//模拟用户账户
	private Account account;
	//当前取钱线程所希望取得钱数
	private double drawAmount;
	public DrawThread(String name , Account account , double drawAmount)
	{
		super(name);
		this.account = account ;
		this.drawAmount = drawAmount;
	}
	//重复100次执行取钱操作
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			account.draw(drawAmount);
		}
	}
}