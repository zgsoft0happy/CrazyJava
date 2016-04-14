/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
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
	//该TextField文本框用于输入发送邮件的地址
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
	//实现发送邮件
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("程序向”" + mailAddress.getText() + "“发送邮件...");
		//发送邮件的真实实现
	}
}