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
public class DepositThread extends Thread
{
	//ģ���û��ʻ�
	private Account account;
	//��ǰ����߳���ϣ�����Ǯ��
	private double depositAmount;
	public DepositThread(String name , Account account , double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}
	//�ظ�ִ��100�δ�����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			account.deposit(depositAmount);
		}
	}
}