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
public class DrawTest
{
	public static void main(String[] args)
	{
		//����һ���˻�
		Account acct = new Account("1234567" , 0);
		new DrawThread("ȡǮ��" , acct , 800).start();
		new DepositThread("����߼�" , acct , 800).start();
		new DepositThread("�������" , acct , 800).start();
		new DepositThread("����߱�" , acct , 800).start();
	}
}