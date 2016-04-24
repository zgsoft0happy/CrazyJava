/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-15   Locate:149
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
import java.text.*;
import java.net.*;
import javax.swing.border.*;
public class JFormattedTextFieldText
{
	private JFrame mainWin = new JFrame("测试格式化文本框");
	private JButton okButton = new JButton("确定");
	//定义用于添加格式化文本框的容器
	private JPanel mainPanel = new JPanel();
	JFormattedTextField[] fields = new JFormattedTextField[6];
	String[] behaviorLabels = new String[]
	{
		"CONNIT",
		"CONNIT_OR_REVERT",
		"PERSIST",
		"REVERT"
	};
	int[] behaviors = new int[]
	{
		JFormattedTextField.COMMIT,
		JFormattedTextField.COMMIT_OR_REVERT,
		JFormattedTextField.PERSIST,
		JFormattedTextField.REVERT
	};
	ButtonGroup bg = new ButtonGroup();
	public void init()
	{
		//添加按钮
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		mainPanel.setLayout(new GridLayout(0 , 3));
		mainWin.add(mainPanel , BorderLayout.CENTER);
		//使用NumberFormat的integerInstance创建一个JFormattedTextField对象
		fields[0] = new JFormattedTextField(NumberFormat.getIntegerInstance());
		//设置初始值
		fields[0].setValue(100);
		addRow("整数格式文本框：" , fields[0]);
		//使用NumberFormat的currencyInstance创建一个JFormattedTextField对象
		fields[1] = new JFormattedTextField(NumberFormat.getCurrencyInstance());
		fields[1].setValue(100.0);
		addRow("货币格式文本框" , fields[1]);
		//使用默认的日期格式创建一个JFormattedTextField对象
		fields[2] = new JFormattedTextField(DateFormat.getDateInstance());
		fields[2].setValue(new Date());
		addRow("默认的日期格式器：" , fields[2]);
		//使用SHORT类型的日期格式器创建一个JFormattedTextField对象
		//且要求采用严格的日期格式
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		//要求采用严格的日期格式语法
		format.setLenient(false);
		fields[3] = new JFormattedTextField(format);
		fields[3].setValue(new Date());
		addRow("SHORT类型的日期格式器（语法严格）：" , fields[3]);
		try
		{
			//创建默认的DefaultFormatter对象
			DefaultFormatter formatter = new DefaultFormatter();
			//关闭overwrite状态
			formatter.setOverwriteMode(false);
			fields[4] = new JFormattedTextField(formatter);
			//使用DefaultFormatter来格式化URL
			fields[4].setValue(new URL("http://www.crazyit.org"));
			addRow("URL:" , fields[4]);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		try
		{
			MaskFormatter formatter = new MaskFormatter("020-########");
			//设置占位符
			formatter.setPlaceholderCharacter('□');
			fields[5] = new JFormattedTextField(formatter);
			//设置初始值
			fields[5].setValue("020-28309378");
			addRow("电话号码：" , fields[5]);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
		JPanel focusLostPanel = new JPanel();
		//采用循环方式加入失去焦点行为的单选按钮
		for (int i = 0 ; i < behaviorLabels.length ; i++)
		{
			final int index = 1;
			final JRadioButton radio = new JRadioButton(behaviorLabels[i]);
			//默认选中第二个单选按钮
			if (i == 1)
			{
				radio.setSelected(true);
			}
			focusLostPanel.add(radio);
			bg.add(radio);
			//为所有的单选按钮添加事件监听器
			radio.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//如果当前该单选按钮处于选中状态
					if (radio.isSelected())
					{
						//设置所有格式化文本框失去焦点的行为
						for (int j = 0 ; j < fields.length ; j++)
						{
							fields[j].setFocusLostBehavior(behaviors[index]);
						}
					}
				}
			});
		}
		focusLostPanel.setBorder(new TitledBorder(new EtchedBorder() , "请选择焦点失去后的行为"));
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(focusLostPanel , BorderLayout.NORTH);
		p.add(buttonPanel , BorderLayout.SOUTH);
		
		mainWin.add(p , BorderLayout.SOUTH);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	//定义添加一行格式化文本框的方法
	private void addRow(String labelText , final JFormattedTextField field)
	{
		mainPanel.add(new JLabel(labelText));
		mainPanel.add(field);
		final JLabel valueLabel = new JLabel();
		mainPanel.add(valueLabel);
		//为“确定”按钮添加事件监听器
		//当用户单击“确定”按钮时，文本框后显示文本框的值
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Object value = field.getValue();
				//输出格式化文本框的值
				valueLabel.setText(value.toString());
			}
		});
	}
	public static void main(String[] args)
	{
		new JFormattedTextFieldText().init();
	}
}