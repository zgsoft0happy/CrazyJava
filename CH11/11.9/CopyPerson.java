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
import java.awt.datatransfer.*;
public class CopyPerson
{
	Frame f = new Frame("���ƶ���");
	Button copy = new Button("����");
	Button paste = new Button("ճ��");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//�������ؼ�����
	Clipboard clipboard = new Clipboard("cp");
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("����"));
		p.add(name);
		p.add(new Label("����"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		//Ϊ"����"��ť����¼�������
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyPerson();
			}
		});
		//Ϊ"ճ��"��ť����¼�������
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readPerson();
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		});
		bp.add(copy);
		bp.add(paste);
		f.add(bp , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public void copyPerson()
	{
		//��name��age�ı�������ݴ���Person����
		Person p = new Person(name.getText() , Integer.parseInt(age.getText()));
		//��Person�����װ��LocalObjectSelection����
		LocalObjectSelection ls = new LocalObjectSelection(p);
		//��LocalObjecctSelection������뱾�ؼ�������
		clipboard.setContents(ls , null);
	}
	public void readPerson() throws Exception
	{
		//��������Person�������õ�DataFlavor����
		DataFlavor personFlavor = new DataFlavor("application/x-java-jvm-local-objectref;class=Person");
		//ȡ�����ؼ������е�����
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			Person p = (Person)clipboard.getData(personFlavor);
			ta.setText(p.toString());
		}
	}
	public static void main(String[] args)
	{
		new CopyPerson().init();
	}
}