/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-20
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
import javax.swing.text.*;
import javax.swing.undo.*;
public class JFormattedTextFieldTest
{
	private JFrame mainWin = new JFrame("测试格式化文本框");
	private JButton okButton = new JButton("确定");
	//定义用于添加格式化文本框的容器
	private JPanel mainPanel = new JPanel();
	JFormattedTextField[] fields = new JFormattedTextField[6];
	String[] behaviorLabels = new String[]
	{
		"COMMIT",
		"COMMIT_OR_REVERT",
		"PERSIST",
		"REVERT"
	};
	int[] behaviors = new int[]
	{
		JFormattedTextField.COMMIT,
		JFormattedTextField.COMMIT_OR_REVERT,
		JFromattedTextField.PESIST,
		JFromattedTextField.REVERT
	};
	ButtonGroup bg = new ButtonGroup();
	public void init()
	{
		//添加按钮
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		mainPanel.setLayout(new GridLayout(0 , 3));
		mainWin.add(mainPanel , BorderLayout.CENTER);
		//使用NumberFormat的integerInstance创建一个JformattedTextField对象
		fields[0] = new JFormattedTextField(NumberFormat.getIntegerInstance());
		//设置初始值
		fields[0].setValue(100);
		addRow("整数格式文本框：" , fields[0]);
		//使用NumberFormat的currencyInstance创建一个JFormattedTextField对象
		fields[1] = new JFormattedTextField(NumberFormat.getCurrencyInstance());
		fields[1].setValue(100.0);
		addRow("货币格式文本框：" , fields[1]);
		//使用默认的日期格式创建一个JFormattedTextField对象
		fields[2] = new JFormattedTextField(DateFormat.getDateInstance());
		fields[2].setValue(new Date());
		addRow("默认的日期格式器：" , fields[2]);
		//使用SHORT类型的日期格式创建一个JFormattedTextField对象
		//且要求采用严格日期格式
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		//要求采用严格的日期格式语法
		format.setLenient(false);
		fields[3] = new JFormattedTextField(format);
		fields.setValue(new Date());
		add
	}
}