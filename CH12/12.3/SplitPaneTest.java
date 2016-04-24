/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class SplitPaneTest
{
	Book[] books = new Book[]{
		new Book("���Java����" , new ImageIcon("ico/java.png") , "���ڹ���Java�����ȫ���ͼ��\n���ö���ѧ�û�"),
		new Book("������Java EE��ҵӦ��ʵս" , new ImageIcon("ico/ee.png") , "SSH���Ͽ����ľ���ͼ�飬ֵ��ӵ��"),
		new Book("���Android����" , new ImageIcon("ico/android.png") , "ȫ�����Androidƽ̨Ӧ�ó���\n�����ĸ�����֪ʶ")
	};
	JFrame jf = new JFrame("����JSplitPane");
	JList<Book> bookList = new JList<>(books);
	JLabel bookCover = new JLabel();
	JTextArea bookDesc = new JTextArea();
	public void init()
	{
		//Ϊ�������������Ѵ�С
		bookList.setPreferredSize(new Dimension(150 , 300));
		bookCover.setPreferredSize(new Dimension(300 , 150));
		bookDesc.setPreferredSize(new Dimension(300 , 150));
		//Ϊ�����б�����¼�������
		bookList.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent event)
			{
				Book book = (Book)bookList.getSelectedValue();
				bookCover.setIcon(book.getIco());
				bookDesc.setText(book.getDesc());
			}
		});
		//����һ����ֱ�ķָ���壬��bookCover�������棬��bookDesc�������棬֧����������
		JSplitPane left = new JSplitPane(JSplitPane.VERTICAL_SPLIT , true , bookCover , new JScrollPane(bookDesc));
		//�򿪡�һ����չ������
		left.setOneTouchExpandable(true);
		//����������÷ָ����Ĵ�С
		//left.setDividerSize(50);
		//���ø÷ָ��������������������Ѵ�С����������
		left.resetToPreferredSizes();
		//����һ��ˮƽ�ķָ����
		//��left���������ߣ���bookList��������ұ�
		JSplitPane content = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT , left , bookList);
		jf.add(content);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SplitPaneTest().init();
	}
}