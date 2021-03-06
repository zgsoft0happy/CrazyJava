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
import java.awt.*;
public class TableCellRendererTest
{
	JFrame jf = new JFrame("使用单元格绘制器");
	JTable table;
	// 定义二维数组作为表格数据
	Object[][] tableData = 
	{
		new Object[]{"李清照" , 29 , "女"
			, new ImageIcon("icon/3.gif") , true},
		new Object[]{"苏格拉底", 56 , "男" 
			, new ImageIcon("icon/1.gif") , false},
		new Object[]{"李白", 35 , "男"
			, new ImageIcon("icon/4.gif") , true},
		new Object[]{"弄玉", 18 , "女" 
			, new ImageIcon("icon/2.gif") , true},
		new Object[]{"虎头" , 2 , "男" 
			, new ImageIcon("icon/5.gif") , true}
	};
	// 定义一维数据作为列标题
	String[] columnTitle = {"姓名" , "年龄" , "性别" 
		, "主头像" , "是否中国人"};
	public void init()
	{
		// 以二维数组和一维数组来创建一个ExtendedTableModel对象
		ExtendedTableModel model = new ExtendedTableModel(columnTitle
			, tableData);
		// 以ExtendedTableModel来创建JTable
		table = new JTable(model);
		table.setRowSelectionAllowed(false);
		table.setRowHeight(40);
		// 获取第三列
		TableColumn lastColumn = table.getColumnModel().getColumn(2);
		// 对第三列采用自定义的单元格绘制器
		lastColumn.setCellRenderer(new GenderTableCellRenderer());
		// 将JTable对象放在JScrollPane中，并将该JScrollPane显示出来
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
//定义自定义的单元格绘制器
class GenderTableCellRenderer extends JPanel implements TableCellRenderer
{
	private String cellValue;
	//定义图标的高度和宽度
	private int ICON_WIDTH = 23;
	private int ICON_HEIGHT = 21;
	public Component getTableCellRendererComponent(JTable table ,
		Object value,boolean isSelected , boolean hasFocus ,
		int row , int column)
	{
		cellValue = (String)value;
		//设置选中状态下绘制边框
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
	//重写paint方法，负责绘制该单元格内容
	public void paint(Graphics g)
	{
		//如果表格值为"男"或"male"，则绘制一个男性图标
		if (cellValue.equalsIgnoreCase("男") || cellValue.equalsIgnoreCase("male"))
		{
			drawImage(g , new ImageIcon("icon/male.gif").getImage());
		}
		//如果表格值为"女"或"female"，则绘制一个女性图标
		if (cellValue.equalsIgnoreCase("女") || cellValue.equalsIgnoreCase("female"))
		{
			drawImage(g , new ImageIcon("icon/female.gif").getImage());
		}
	}
	//绘制图标的方法
	private void drawImage(Graphics g , Image image)
	{
		g.drawImage(image , (getWidth() - ICON_WIDTH) / 2 , 
			(getHeight() - ICON_HEIGHT) / 2 , null);
	}
}