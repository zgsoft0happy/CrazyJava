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
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
public class PanelTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		//创建一个Panel容器
		Panel p = new Panel();
		//向Panel容器中添加两个组件
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		//将Penal容器添加到Frame窗口中
		f.add(p);
		//设置窗口的大小、位置
		f.setBounds(30 , 30 , 250 , 120);
		//将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}