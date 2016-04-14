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
import java.io.*;
public class CopySerializable
{
	Frame f = new Frame("赋值对象");
	Button copy = new Button("复制");
	Button paste = new Button("粘贴");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//创建系统剪贴板
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("姓名"));
		p.add(name);
		p.add(new Label("年龄"));
		p.add(age);
		f.add(p , BorderLayout.NORTH)                                                                                                                      ;
		f.add(ta);
		Panel bp = new Panel();
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyDog();
			}
		});
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readDog();
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
	public void copyDog()
	{
		Dog d = new Dog(name.getText() , Integer.parseInt(age.getText()));
		//把dog实例封装成SerialSelection对象
		SerialSelection ls = new SerialSelection(d);
		//把SerialSelection对象放入系统剪贴板中
		clipboard.setContents(ls , null);
	}
	public void readDog() throws Exception
	{
		DataFlavor personFlavor = new DataFlavor(DataFlavor.javaSerializedObjectMimeType + ";class=Dog");
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			//从系统剪贴板中读取数据
			Dog d = (Dog)clipboard.getData(personFlavor);
			ta.setText(d.toString());
		}
	}
	public static void main(String[] args)
	{
		new CopySerializable().init();
	}
}