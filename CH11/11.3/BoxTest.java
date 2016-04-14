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
import javax.swing.*;
public class BoxTest
{
	private Frame f = new Frame("测试");
	//定义水平摆放组件的Box对象
	private Box horizontal = Box.createHorizontalBox();
	//定义垂直摆放组件的Box对象
	private Box vertical = Box.createVerticalBox();
	public void init()
	{
		horizontal.add(new Button("水平按钮一"));
		horizontal.add(new Button("水平按钮二"));
		vertical.add(new Button("垂直按钮一"));
		vertical.add(new Button("垂直按钮二"));
		f.add(horizontal , BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new BoxTest().init();
	}
}