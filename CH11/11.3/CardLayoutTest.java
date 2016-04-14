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
public class CardLayoutTest
{
	Frame f = new Frame("���Դ���");
	String[] names = {"��һ��" , "�ڶ���" , "������" , "������" , "������"};
	Panel p1 = new Panel();
	public void init()
	{
		final CardLayout c = new CardLayout();
		p1.setLayout(c);
		for (int i = 0 ; i < names.length ; i++)
		{
			p1.add(names[i] , new Button(names[i]));
		}
		Panel p = new Panel();
		//������ʾ��һ�ŵİ�ť
		Button previous = new Button("��һ��");
		previous.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.previous(p1);
			}
		});
		//������ʾ��һ�ŵİ�ť
		Button next = new Button("��һ��");
		next.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.next(p1);
			}
		});
		//������ʾ��һ�ŵİ�ť
		Button first = new Button("��һ��");
		first.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.first(p1);
			}
		});
		//������ʾ���һ�ŵİ�ť
		Button last = new Button("���һ��");
		last.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.last(p1);
			}
		});
		//���Ƹ���Card����ʾ�İ�ť
		Button third = new Button("������");
		third.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.show(p1 , "������");
			}
		});
		p.add(previous);
		p.add(next);
		p.add(first);
		p.add(last);
		p.add(third);
		f.add(p1);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CardLayoutTest().init();
	}
}