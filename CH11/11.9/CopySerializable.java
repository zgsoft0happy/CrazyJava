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
import java.io.*;
public class CopySerializable
{
	Frame f = new Frame("��ֵ����");
	Button copy = new Button("����");
	Button paste = new Button("ճ��");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//����ϵͳ������
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("����"));
		p.add(name);
		p.add(new Label("����"));
		p.add(age);
		f.add(p , BorderLayout.NORTH)                                                                                                                      ;
		f.add(ta);
		Panel bp = new Panel();
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyDog();
			}
		});
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readDog();
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
	public void copyDog()
	{
		Dog d = new Dog(name.getText() , Integer.parseInt(age.getText()));
		//��dogʵ����װ��SerialSelection����
		SerialSelection ls = new SerialSelection(d);
		//��SerialSelection�������ϵͳ��������
		clipboard.setContents(ls , null);
	}
	public void readDog() throws Exception
	{
		DataFlavor personFlavor = new DataFlavor(DataFlavor.javaSerializedObjectMimeType + ";class=Dog");
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			//��ϵͳ�������ж�ȡ����
			Dog d = (Dog)clipboard.getData(personFlavor);
			ta.setText(d.toString());
		}
	}
	public static void main(String[] args)
	{
		new CopySerializable().init();
	}
}