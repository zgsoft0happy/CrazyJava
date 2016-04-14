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
import javax.swing.*;
public class DialogTest
{
	Frame f = new Frame("测试");
	Dialog d1 = new Dialog(f , "模式对话框" , true);
	Dialog d2 = new Dialog(f , "非模式对话框" , false);
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	public void init()
	{
		d1.setBounds(20 , 30 , 300 , 400);
		d2.setBounds(20 , 30 , 300 , 400);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d1.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d2.setVisible(true);
			}
		});
		f.add(b1);
		f.add(b2 , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DialogTest().init();
	}
}