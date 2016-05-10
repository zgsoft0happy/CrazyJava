/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-10  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.Date;
public class SleepTest
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("当前时间：" + new Date());
			//调用sleep()方法让当前线程暂停1s
			Thread.sleep(1000);
		}
	}
}