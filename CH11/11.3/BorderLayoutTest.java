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
public class BorderLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		//设置Frame容器使用BorderrLayout布局管理器
		f.setLayout(new BorderLayout(30 , 5));
		f.add(new Button("南") , BorderLayout.SOUTH);
		f.add(new Button("北") , BorderLayout.NORTH);
		//默认添加到中间区域中
		f.add(new Button("中"));
		f.add(new Button("东") , BorderLayout.EAST);
		f.add(new Button("西") , BorderLayout.WEST);
		//设置窗口为最佳大小
		f.pack();
		//将窗口显示出来
		f.setVisible(true);
	}
}