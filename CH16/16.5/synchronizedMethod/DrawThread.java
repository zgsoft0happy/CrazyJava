/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-11  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
public class DrawThread extends Thread
{
	//ģ���û��ʻ�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;
	public DrawThread(String name , Account account , double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	//������߳��޸�ͬһ����������ʱ�����漰���ݰ�ȫ����
	public void run()
	{
		//ֱ�ӵ���account�����draw()������ִ��ȡǮ����
		//ͬ��������ͬ����������this��this��������draw()�����Ķ���
		//Ҳ����˵���سǽ���draw()����֮ǰ�������ȶ�acoount�������
		account.draw(drawAmount);
	}
}