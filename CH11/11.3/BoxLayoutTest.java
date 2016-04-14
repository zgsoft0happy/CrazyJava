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
import javax.swing.*;
import java.awt.*;
public class BoxLayoutTest
{
	private Frame f = new Frame("测试");
	public void init()
	{
		f.setLayout(new BoxLayout(f , BoxLayout.Y_AXIS));
		//下面按钮将会垂直排列
		f.add(new Button("第一个按钮"));
		f.add(new Button("按钮二"));
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new BoxLayoutTest().init();
	}
}