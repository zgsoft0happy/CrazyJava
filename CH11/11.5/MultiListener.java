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
public class MultiListener
{
	private Frame f = new Frame("����");
	private TextArea ta = new TextArea(6 , 40);
	private Button b1 = new Button("��ťһ");
	private Button b2 = new Button("��ť��");
	public void init()
	{
		//����FirstListener������ʵ��
		FirstListener fl = new FirstListener();
		//��b1��ťע�������¼�������
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		//��f1�¼�������ע���b2��ť
		b2.addActionListener(fl);
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("��һ���¼����������������¼�Դ�ǣ�" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("�����ˡ�" + e.getActionCommand() + "����ť\n");
		}
	}
	public static void main(String[] args)
	{
		new MultiListener().init();
	}
}