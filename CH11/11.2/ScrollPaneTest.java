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
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.Button;
public class ScrollPaneTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		//创建一个ScrollPane容器，指定总是具有滚动条
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		//向ScrollPane容器中添加两个组件
		sp.add(new TextField(20));
		sp.add(new Button("单击我"));
		//将ScrollPane容器添加到Frame对象中
		f.add(sp);
		//设置窗口的大小、位置
		f.setBounds(30 , 30 , 250 , 120);
		//将窗口显示出来
		f.setVisible(true);
	}
}