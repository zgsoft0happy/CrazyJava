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
public class SimpleTable
{
	JFrame jf = new JFrame("�򵥱��");
	JTable table ;
	//�����ά������Ϊ�������
	Object[][] tableData =
	{
		new Object[]{"������" , 29 , "Ů"},
		new Object[]{"�ո�����" , 56 , "��"},
		new Object[]{"���" , 35 , "��"},
		new Object[]{"Ū��" , 18 , "Ů"},
		new Object[]{"��ͷ" , 2 , "��"}
	};
	//������Ϊ������Ϊ�б���
	Object[] columnTitle = {"����" , "����" , "�Ա�"};
	public void init()
	{
		//�Զ�ά�����һά����������һ��JTable����
		table = new JTable(tableData , columnTitle);
		//��JTable�������JScrollPane��
		//������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleTable().init();
	}
}