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
public class MultiListener
{
	private Frame f = new Frame("测试");
	private TextArea ta = new TextArea(6 , 40);
	private Button b1 = new Button("按钮一");
	private Button b2 = new Button("按钮二");
	public void init()
	{
		//创建FirstListener监听器实例
		FirstListener fl = new FirstListener();
		//给b1按钮注册两个事件监听器
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		//将f1事件监听器注册给b2按钮
		b2.addActionListener(fl);
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("第一个事件监听器被触发，事件源是：" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("单击了“" + e.getActionCommand() + "”按钮\n");
		}
	}
	public static void main(String[] args)
	{
		new MultiListener().init();
	}
}