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
import javax.swing.*;
public class FileDialogTest
{
	Frame f = new Frame("����");
	//���������ļ��Ի���
	FileDialog d1 = new FileDialog(f , "ѡ����Ҫ���ļ�" , FileDialog.LOAD);
	FileDialog d2 = new FileDialog(f , "ѡ�񱣴��ļ���·��" , FileDialog.SAVE);
	Button b1 = new Button("���ļ�");
	Button b2 = new Button("�����ļ�");
	public void init()
	{
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d1.setVisible(true);
				//��ӡ���û�ѡ����ļ�·�����ļ���
				System.out.println(d1.getDirectory() + d1.getFile());
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d2.setVisible(true);
				//��ӡ���û�ѡ����ļ�·�����ļ���
				System.out.println(d2.getDirectory() + d2.getFile());
			}
		});
		f.add(b1);
		f.add(b2 , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FileDialogTest().init();
	}
}