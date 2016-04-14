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
import javax.swing.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
public class DragSourceTest
{
	JFrame jf = new JFrame("Swing的拖放支持");
	JLabel srcLabel = new JLabel("AWT的拖放支持。\n + 将该文本域的内容拖入其他程序。\n");
	public void init()
	{
		DragSource dragSource = DragSource.getDefaultDragSource();
		//将srcLabel转换成拖放源，他能接受赋值、移动两种操作
		dragSource.createDefaultDragGestureRecognizer(srcLabel 
			, DnDConstants.ACTION_COPY_OR_MOVE , new DragGestureListener()
		{
			public void dragGestureRecognized(DragGestureEvent event)
			{
				//将JLabel里的文本信息包装成Transferable对象
				String txt = srcLabel.getText();
				Transferable transferable = new StringSelection(txt);
				//继续拖放操作，拖放过程中使用手状光标
				event.startDrag(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) , transferable);
			}
		});
		jf.add(new JScrollPane(srcLabel));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DragSourceTest().init();
	}
}