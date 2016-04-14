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
public class FlowLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		//设置Frame容器使用FlowLayout布局管理器
		f.setLayout(new FlowLayout(FlowLayout.LEFT , 20 , 5));
		//向窗口中添加10个按钮
		for (int i = 0 ; i < 10 ; i++)
		{
			f.add(new Button("按钮" + i));
		}
		//设置窗口大小为最佳
		f.pack();
		//将窗口显示出来(Frame对象默认处于隐藏状态)
		f.setVisible(true);
	}
}