/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class ThreadExceptionTest implements Runnable
{
	public void run()
	{
		firstMethod();
	}
	public void firstMethod()
	{
		secondMethod();
	}
	public void secondMethod()
	{
		int a = 5;
		int b = 0;
		int c = a / b;
	}
	public static void main(String[] args)
	{
		new Thread(new ThreadExceptionTest()).start();
	}
}