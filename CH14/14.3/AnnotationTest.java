/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.*;
import java.awt.event.*;
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("使用注释绑定事件监听器");
	//使用Annotation为ok按钮绑定事件监听器
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok = new JButton("确定");
	//使用Annotation为cancel按钮绑定事件监听器
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel = new JButton("取消");
	public void init()
	{
		//初始化界面的方法
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);	//	1
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new AnnotationTest().init();
	}
}
//定义ok按钮的时间监听器实现类
class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "单击了确定按钮");
	}
}
//定义cancel按钮的事件监听器实现类
class CancelListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "单击了取消按钮");
	}
}