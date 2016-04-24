/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-06
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
public class TableCellRendererTest
{
	JFrame jf = new JFrame("ʹ�õ�Ԫ�������");
	JTable table;
	// �����ά������Ϊ�������
	Object[][] tableData = 
	{
		new Object[]{"������" , 29 , "Ů"
			, new ImageIcon("icon/3.gif") , true},
		new Object[]{"�ո�����", 56 , "��" 
			, new ImageIcon("icon/1.gif") , false},
		new Object[]{"���", 35 , "��"
			, new ImageIcon("icon/4.gif") , true},
		new Object[]{"Ū��", 18 , "Ů" 
			, new ImageIcon("icon/2.gif") , true},
		new Object[]{"��ͷ" , 2 , "��" 
			, new ImageIcon("icon/5.gif") , true}
	};
	// ����һά������Ϊ�б���
	String[] columnTitle = {"����" , "����" , "�Ա�" 
		, "��ͷ��" , "�Ƿ��й���"};
	public void init()
	{
		// �Զ�ά�����һά����������һ��ExtendedTableModel����
		ExtendedTableModel model = new ExtendedTableModel(columnTitle
			, tableData);
		// ��ExtendedTableModel������JTable
		table = new JTable(model);
		table.setRowSelectionAllowed(false);
		table.setRowHeight(40);
		// ��ȡ������
		TableColumn lastColumn = table.getColumnModel().getColumn(2);
		// �Ե����в����Զ���ĵ�Ԫ�������
		lastColumn.setCellRenderer(new GenderTableCellRenderer());
		// ��JTable�������JScrollPane�У�������JScrollPane��ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TableCellRendererTest().init();
	}
}
//�����Զ���ĵ�Ԫ�������
class GenderTableCellRenderer extends JPanel implements TableCellRenderer
{
	private String cellValue;
	//����ͼ��ĸ߶ȺͿ��
	private int ICON_WIDTH = 23;
	private int ICON_HEIGHT = 21;
	public Component getTableCellRendererComponent(JTable table ,
		Object value,boolean isSelected , boolean hasFocus ,
		int row , int column)
	{
		cellValue = (String)value;
		//����ѡ��״̬�»��Ʊ߿�
		if (hasFocus)
		{
			setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		}
		else
		{
			setBorder(null);
		}
		return this;
	}
	//��дpaint������������Ƹõ�Ԫ������
	public void paint(Graphics g)
	{
		//������ֵΪ"��"��"male"�������һ������ͼ��
		if (cellValue.equalsIgnoreCase("��") || cellValue.equalsIgnoreCase("male"))
		{
			drawImage(g , new ImageIcon("icon/male.gif").getImage());
		}
		//������ֵΪ"Ů"��"female"�������һ��Ů��ͼ��
		if (cellValue.equalsIgnoreCase("Ů") || cellValue.equalsIgnoreCase("female"))
		{
			drawImage(g , new ImageIcon("icon/female.gif").getImage());
		}
	}
	//����ͼ��ķ���
	private void drawImage(Graphics g , Image image)
	{
		g.drawImage(image , (getWidth() - ICON_WIDTH) / 2 , 
			(getHeight() - ICON_HEIGHT) / 2 , null);
	}
}