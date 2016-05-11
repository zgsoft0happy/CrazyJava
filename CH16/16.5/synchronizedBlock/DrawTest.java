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
public class DrawTest
{
	public static void main(String[] args)
	{
		//创建一个账户
		Account acct = new Account("1234567" , 1000);
		//模拟两个线程对同一个账户取钱
		new DrawThread("甲" , acct , 800).start();
		new DrawThread("乙" , acct , 800).start();
	}
}