/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-06
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class DefaultTableModelTest
{
	JFrame mainWin = new JFrame("管理数据行、数据列");
	final int COLUMN_COUNT = 5;
	DefaultTableModel model ;
	JTable table;
	//用于保存被隐藏列的List集合
	ArrayList<TableColumn> hiddenColumns = new ArrayList<>();
	public void init()
	{
		model = new DefaultTableModel(COLUMN_COUNT , COLUMN_COUNT);
		for (int i = 0 ; i < COLUMN_COUNT ; i++)
		{
			for (int j = 0 ; j < COLUMN_COUNT ; j++)
			{
				model.setValueAt("老单元格的值 " + i + " " + j , i , j);
			}
		}
		table = new JTable(model);
		mainWin.add(new JScrollPane(table) , BorderLayout.CENTER);
		//为窗口安装菜单
		JMenuBar menuBar = new JMenuBar();
		mainWin.setJMenuBar(menuBar);
		JMenu tableMenu = new JMenu("管理");
		menuBar.add(tableMenu);
		JMenuItem hideColumnsItem = new JMenuItem("隐藏选中列");
		hideColumnsItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//获取所有选中列的索引
				int[] selected = table.getSelectedColumns();
				TableColumnModel columnModel = table.getColumnModel();
				//依次把每一个选中的列隐藏起来，并使用List保存这些列
				for (int i = selected.length - 1 ; i >= 0 ; i--)
				{
					TableColumn column = columnModel.getColumn(selected[i]);
					//隐藏制定列
					table.removeColumn(column);
					//把隐藏的列保存起来，确保以后可以显示出来
					hiddenColumns.add(column);
				}
			}
		});
		tableMenu.add(hideColumnsItem);
		JMenuItem showColumnsItem = new JMenuItem("显示隐藏列");
		showColumnsItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//把所有的隐藏列依次显示出来
				for(TableColumn tc : hiddenColumns)
				{
					//依次把所有的隐藏列显示出来
					table.addColumn(tc);
				}
				//清空保存隐藏列的List集合
				hiddenColumns.clear();
			}
		});
		tableMenu.add(showColumnsItem);
		JMenuItem addColumnItem = new JMenuItem("插入选中列");
		addColumnItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//获取所有选中列的索引
				int[] selected = table.getSelectedColumns();
				TableColumnModel columnModel = table.getColumnModel();
				//依次将选中的列添加到JTable之后
				for (int i = selected.length - 1 ; i >= 0 ; i--)
				{
					TableColumn column = columnModel.getColumn(selected[i]);
					table.addColumn(column);
				}
			}
		});
		tableMenu.add(addColumnItem);
		JMenuItem addRowItem = new JMenuItem("增加行");
		addRowItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//创建一个String数组作为新增行的内容
				String[] newCells = new String[COLUMN_COUNT];
				for (int i = 0 ; i < newCells.length ; i++)
				{
					newCells[i] = "新单元格值 " + model.getRowCount() + " " + i;
				}
				//向TableModel插入一行
				model.addRow(newCells);
			}
		});
		tableMenu.add(addRowItem);
		JMenuItem removeRowsItem = new JMenuItem("删除选中行");
		removeRowsItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//获取所有选中行
				int[] selected = table.getSelectedRows();
				//依次删除所有选中行
				for (int i = selected.length - 1; i >= 0 ; i--)
				{
					model.removeRow(selected[i]);
				}
			}
		});
		tableMenu.add(removeRowsItem);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DefaultTableModelTest().init();
	}
}