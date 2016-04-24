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
import java.lang.reflect.*;
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
public class JFormattedTextFieldTest2
{
	private JFrame mainWin = new JFrame("测试格式化文本框");
	private JButton okButton = new JButton("确定");
	//定义用于添加格式化文本框的容器
	private JPanel mainPanel = new JPanel();
	public void init()
	{
		//添加按钮
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		mainWin.setLayout(new GridLayout(0 , 3));
		mainWin.add(mainPanel , BorderLayout.CENTER);
		JFormattedTextField intField0 = new JFormattedTextField(
			new InternationalFormatter(NumberFormat.getIntegerInstance())
		{
			protected DocumentFilter getDocumentFilter()
			{
				return new NumberFilter();
			}
		});
		intField0.setValue(100);
		addRow("只接受数字的文本框" , intField0);
		JFormattedTextField intField1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
		intField1.setValue(100);
		//添加输入检测器
		intField1.setInputVerifier(new FormattedTextFieldVerifier());
		addRow("带输入校验器的文本框" , intField1);
		//创建自定义格式器对象
		IPAddressFormatter ipFormatter = new IPAddressFormatter();
		ipFormatter.setOverwriteMode(false);
		//以自定义格式器对象创建格式化文本框
		JFormattedTextField ipField = new JFormattedTextField(ipFormatter);
		ipField.setValue(new byte[]{(byte)192 , (byte)168 , 4 , 1});
		addRow("IP地址格式" , ipField);
		mainWin.add(buttonPanel , BorderLayout.SOUTH);
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
		//当用户单击“确定”按钮时，文本框后显示文本框内的值
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Object value = field.getValue();
				//如果该值是数组，则使用Arrays的toString()方法输出数组
				if (value.getClass().isArray())
				{
					StringBuilder builder = new StringBuilder();
					builder.append('{');
					for ( int i = 0 ; i < Array.getLength(value) ; i++)
					{
						if (i > 0)
							builder.append(',');
						builder.append(Array.get(value , i).toString());
					}
					builder.append('}');
					valueLabel.setText(builder.toString());
				}
				else
				{
					//输出格式化文本框的值
					valueLabel.setText(value.toString());
				}
			}
		});
	}
	public static void main(String[] args)
	{
		new JFormattedTextFieldTest2().init();
	}
}
//输入校验器
class FormattedTextFieldVerifier extends InputVerifier
{
	//当输入组件失去焦点时，该方法被触发
	public boolean verify(JComponent component)
	{
		JFormattedTextField field = (JFormattedTextField)component;
		//返回用户输入是否有效
		return field.isEditValid();
	}
}
//数字过滤器
class NumberFilter extends DocumentFilter
{
	public void insertString(FilterBypass fb , int offset , String string , AttributeSet attr) throws BadLocationException
	{
		StringBuilder builder = new StringBuilder(string);
		//过滤用户输入的所有字符
		filterInt(builder);
		super.insertString(fb , offset , builder.toString() , attr);
	}
	public void replace(FilterBypass fb , int offset , int length , String string , AttributeSet attr)throws BadLocationException
	{
		if (string != null)
		{
			StringBuilder builder = new StringBuilder(string);
			//过滤用户替换的所有字符
			filterInt(builder);
			string = builder.toString();
		}
		super.replace(fb , offset , length , string , attr);
	}
	//过滤整数字符，把所有非0~9的字符全部删除
	private void filterInt(StringBuilder builder)
	{
		for (int i = builder.length() - 1 ; i >= 0 ; i--)
		{
			int cp = builder.codePointAt(i);
			if (cp >'9' || cp < '0')
			{
				builder.deleteCharAt(i);
			}
		}
	}
}
class IPAddressFormatter extends DefaultFormatter
{
	public String valueToString(Object value) throws ParseException
	{
		if (!(value instanceof byte[]))
		{
			throw new ParseException("该IP地址的值只能是字节数组" , 0);
		}
		byte[] a = (byte[])value;
		if (a.length != 4)
		{
			throw new ParseException("IP地址必须是4个整数" , 0);
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0 ; i < 4; i++)
		{
			int b = a[i];
			if (b < 0) b+= 256;
			builder.append(String.valueOf(b));
			if(i < 3) builder.append('.');
		}
		return builder.toString();
	}
	public Object stringToValue(String text) throws ParseException
	{
		//将格式化文本框内的字符串以点号(.)分成4节
		String[] nums = text.split("\\.");
		if (nums.length != 4)
		{
			throw new ParseException("IP地址必须是4个整数" , 0);
		}
		byte[] a = new byte[4];
		for (int i = 0 ; i < 4 ; i++)
		{
			int b = 0 ;
			try
			{
				b = Integer.parseInt(nums[i]);
			}
			catch (NumberFormatException e)
			{
				throw new ParseException("IP地址必须是整数" , 0);
			}
			if(b < 0 || b >= 256)
			{
				throw new ParseException("IP地址值智能在0~255之间" , 0);
			}
			a[i] = (byte)b;
		}
		return a;
	}
}