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
import javax.swing.*;
public class SimpleClipboard
{
	private Frame f = new Frame("简单的剪贴板程序");
	//获得系统剪贴板
	private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//下面是创建本地剪贴板的代码
	//Clipboard clipboard = new Clipboard("cb");	//1
	//用于复制文本的文本框
	private TextArea jtaCopyTo = new TextArea(5 , 20);
	//用于粘贴文本的文本框
	private TextArea jtaPaste = new TextArea(5 , 20);
	private Button btCopy = new Button("复制");		//复制按钮
	private Button btPaste = new Button("粘贴");	//粘贴按钮
	public void init()
	{
		Panel p = new Panel();
		p.add(btCopy);
		p.add(btPaste);
		btCopy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//讲一个多行文本域里的字符串冯长成StringSelection对象
				StringSelection contents = new StringSelection(jtaCopyTo.getText());
				//将StringSelection对象放入剪贴板中
				clipboard.setContents(contents , null);
			}
		});
		btPaste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//如果剪贴板中包含stringFlavor内容
				if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
				{
					try
					{
						//去除剪贴板中的stringFlavor内容
						String content = (String)clipboard.getData(DataFlavor.stringFlavor);
						jtaPaste.append(content);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		//创建一个水平排列的Box容器
		Box box = new Box(BoxLayout.X_AXIS);
		//将两个多行文本域放在Box容器中
		box.add(jtaCopyTo);
		box.add(jtaPaste);
		//将按钮所在的Panel、Box容器添加到Frame窗口中
		f.add(p , BorderLayout.SOUTH);
		f.add(box , BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleClipboard().init();
	}
}