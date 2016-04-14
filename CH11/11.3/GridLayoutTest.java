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
public class GridLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("计算器");
		Panel p1 = new Panel();
		p1.add(new TextField(3));
		f.add(p1 , BorderLayout.NORTH);
		Panel p2 = new Panel();
		//设置Panel使用GridLayout布局管理器
		p2.setLayout(new GridLayout(3 , 4 , 4 , 4));
		String[] name = {"0" , "1" , "2" , "3" , "4" , "5" , "6"
			, "7" , "8" , "9" , "+" , "-" , "*" , "/" , "."};
		//向Panel中依次添加15个按钮
		for (int i = 0 ; i < name.length ; i++)
		{
			p2.add(new Button(name[i]));
		}
		//默认将Panel对象添加到Frame窗口的中间
		f.add(p2);
		//设置窗口为最佳大小
		f.pack();
		//将窗口显示出来
		f.setVisible(true);
	}
}