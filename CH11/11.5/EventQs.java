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
public class EventQs
{
	private Frame f = new Frame("测试事件");
	private Button ok = new Button("确定");
	private TextField tf = new TextField(30);
	public void init()
	{
		//注册事件监听器
		ok.addActionListener(new OkListener());	//1
		f.add(tf);
		f.add(ok , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//定义事件监听器类
	class OkListener implements ActionListener	//2
	{
		//下面定义的方法就是时间处理器，用于响应特定的事件
		public void actionPerformed(ActionEvent e)		//3
		{
			System.out.println("用户单击了ok按钮");
			tf.setText("Hello World");
		}
	}
	public static void main(String[] args)
	{
		new EventQs().init();
	}
}