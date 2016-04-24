/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-31
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;
import java.util.List;
import javax.swing.event.*;
public class ListModelTest
{
	private JFrame mainWin = new JFrame("测试ListModel");
	//根据NumberListModel对象来创建一个JList对象
	private JList<BigDecimal> numScopeList = new JList<>(new NumberListModel(1 , 21 , 2));
	//根据NumberComboxModel对象来创建JComboBox对象
	private JComboBox<BigDecimal> numScopeSelector = new JComboBox<>(new NumberComboBoxModel(0.1 , 1.2 , 0.1));
	private JTextField showVal = new JTextField(10);
	public void init()
	{
		//JList的可视高度可同时显示4个列表项
		numScopeList.setVisibleRowCount(4);
		//默认选中第三项到第五项（第1项的索引是0）
		numScopeList.setSelectionInterval(2 , 4);
		//设置每个列表项具有指定的高度和宽度
		numScopeList.setFixedCellHeight(30);
		numScopeList.setFixedCellWidth(90);
		//为numScopeList添加监听器
		numScopeList.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)
			{
				//获取用户所选中的数字
				List<BigDecimal> nums = numScopeList.getSelectedValuesList();
				showVal.setText("");
				//把用户选中的数字添加到单行文本框中
				for (BigDecimal num : nums)
				{
					showVal.setText(showVal.getText() + num.toString() + ", ");
				}
			}
		});
		//设置列表项的可视高度可显示5个列表项
		numScopeSelector.setMaximumRowCount(5);
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(new JScrollPane(numScopeList));
		JPanel p = new JPanel();
		p.add(numScopeSelector);
		box.add(p);
		//为numScopeSelector添加监听器
		numScopeSelector.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				//获取JCombobBox中选中的数字
				Object num = numScopeSelector.getSelectedItem();
				showVal.setText(num.toString());
			}
		});
		JPanel bottom = new JPanel();
		bottom.add(new JLabel("您选择的值是："));
		bottom.add(showVal);
		mainWin.add(box);
		mainWin.add(bottom , BorderLayout.SOUTH);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ListModelTest().init();
	}
}
class NumberListModel extends AbstractListModel<BigDecimal>
{
	protected BigDecimal start;
	protected BigDecimal end;
	protected BigDecimal step;
	public NumberListModel(double start , double end , double step)
	{
		this.start = BigDecimal.valueOf(start);
		this.end = BigDecimal.valueOf(end);
		this.step = BigDecimal.valueOf(step);
	}
	//返回列表项的个数
	public int getSize()
	{
		return (int)Math.floor(end.subtract(start).divide(step).doubleValue()) + 1;
	}
	//返回指定索引处的列表项
	public BigDecimal getElementAt(int index)
	{
		return BigDecimal.valueOf(index).multiply(step).add(start);
	}
}
class NumberComboBoxModel extends NumberListModel implements ComboBoxModel<BigDecimal>
{
	//用于保存用户选中的索引
	private int selectId = 0;
	public NumberComboBoxModel(double start , double end , double step)
	{
		super(start , end , step);
	}
	//设置选中“选择项”
	public void setSelectedItem(Object anItem)
	{
		if (anItem instanceof BigDecimal)
		{
			BigDecimal target = (BigDecimal)anItem;
			//根据选中的值来修改选中项的索引
			selectId = target.subtract(super.start).divide(step).intValue();
		}
	}
	//获取“选择项”的值
	public BigDecimal getSelectedItem()
	{
		//根据选中项的索引来取得选中项
		return BigDecimal.valueOf(selectId).multiply(step).add(start);
	}
}