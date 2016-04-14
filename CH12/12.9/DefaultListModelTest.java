/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-01
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DefaultListModelTest
{
	private JFrame mainWin = new JFrame("����DefaultListModel");
	//����һ��JList����
	private JList<String> bookList;
	//����һ��DefaultListModel����
	private DefaultListModel<String> bookModel = new DefaultListModel<>();
	private JTextField bookName = new JTextField(20);
	private JButton removeBn = new JButton("ɾ��ѡ��ͼ��");
	private JButton addBn = new JButton("���ָ��ͼ��");
	public void init()
	{
		//��bookModel�����Ԫ��
		bookModel.addElement("���Java����");
		bookModel.addElement("������Java EE��ҵӦ��ʵս");
		bookModel.addElement("���Android����");
		bookModel.addElement("���Ajax����");
		bookModel.addElement("����Java EE��ҵӦ��ʵս");
		//����DefaultListModel���󴴽�һ��JList����
		bookList = new JList<>(bookModel);
		//���������Ӹ߶�
		bookList.setVisibleRowCount(4);
		//ֻ�ܵ�ѡ
		bookList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//Ϊ��Ӱ�ť����¼�������
		addBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//��bookName�ı�������ݲ���Ϊ��ʱ
				if (!bookName.getText().trim().equals(""))
				{
					//��bookModel�����һ��Ԫ��
					//ϵͳ���Զ���JList����Ӷ�Ӧ���б���
					bookModel.addElement(bookName.getText());
				}
			}
		});
		//Ϊɾ����ť����¼�������
		removeBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//����û��Ѿ�ѡ��һ��
				if (bookList.getSelectedIndex() >= 0)
				{
					//��bookModel��ɾ��ָ����������Ԫ��
					//ϵͳ���Զ�ɾ��JList��Ӧ���б���
					bookModel.removeElementAt(bookList.getSelectedIndex());
				}
			}
		});
		JPanel p = new JPanel();
		p.add(bookName);
		p.add(addBn);
		p.add(removeBn);
		//���bookList���
		mainWin.add(new JScrollPane(bookList));
		//��p�����ӵ�������
		mainWin.add(p , BorderLayout.SOUTH);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DefaultListModelTest().init();
	}
}