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
public class EventQs
{
	private Frame f = new Frame("�����¼�");
	private Button ok = new Button("ȷ��");
	private TextField tf = new TextField(30);
	public void init()
	{
		//ע���¼�������
		ok.addActionListener(new OkListener());	//1
		f.add(tf);
		f.add(ok , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//�����¼���������
	class OkListener implements ActionListener	//2
	{
		//���涨��ķ�������ʱ�䴦������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)		//3
		{
			System.out.println("�û�������ok��ť");
			tf.setText("Hello World");
		}
	}
	public static void main(String[] args)
	{
		new EventQs().init();
	}
}