/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
public class CopyPerson
{
	Frame f = new Frame("复制对象");
	Button copy = new Button("复制");
	Button paste = new Button("粘贴");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//创建本地剪贴板
	Clipboard clipboard = new Clipboard("cp");
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("姓名"));
		p.add(name);
		p.add(new Label("年龄"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		//为"复制"按钮添加事件监听器
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyPerson();
			}
		});
		//为"粘贴"按钮添加事件监听器
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readPerson();
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		});
		bp.add(copy);
		bp.add(paste);
		f.add(bp , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public void copyPerson()
	{
		//以name、age文本框的内容创建Person对象
		Person p = new Person(name.getText() , Integer.parseInt(age.getText()));
		//将Person对象封装成LocalObjectSelection对象
		LocalObjectSelection ls = new LocalObjectSelection(p);
		//将LocalObjecctSelection对象放入本地剪贴板中
		clipboard.setContents(ls , null);
	}
	public void readPerson() throws Exception
	{
		//创建保存Person对象引用的DataFlavor对象
		DataFlavor personFlavor = new DataFlavor("application/x-java-jvm-local-objectref;class=Person");
		//取出本地剪贴板中的内容
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			Person p = (Person)clipboard.getData(personFlavor);
			ta.setText(p.toString());
		}
	}
	public static void main(String[] args)
	{
		new CopyPerson().init();
	}
}