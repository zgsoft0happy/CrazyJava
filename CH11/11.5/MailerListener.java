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
import java.awt.*;
import java.awt.event.*;
public class MailerListener implements ActionListener
{
	//��TextField�ı����������뷢���ʼ��ĵ�ַ
	private TextField mailAddress;
	public MailerListener(){}
	public MailerListener(TextField mailAddress)
	{
		this.mailAddress = mailAddress;
	}
	public void setMailAddress(TextField mailAddress)
	{
		this.mailAddress = mailAddress;
	}
	//ʵ�ַ����ʼ�
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("������" + mailAddress.getText() + "�������ʼ�...");
		//�����ʼ�����ʵʵ��
	}
}