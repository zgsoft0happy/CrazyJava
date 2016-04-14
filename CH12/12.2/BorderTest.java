/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-19
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class BorderTest
{
	private JFrame jf = new JFrame("测试边框");
	public void init()
	{
		jf.setLayout(new GridLayout(2 , 4));
		//使用静态工厂方法创建BevelBorder
		Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED , Color.RED , 
			Color.GREEN , Color.BLUE , Color.GRAY);
		jf.add(getPanelWithBorder(bb , "BevelBorder"));
		//使用静态工厂方法创建LineBorder
		Border lb = BorderFactory.createLineBorder(Color.ORANGE , 10);
		jf.add(getPanelWithBorder(lb , "LineBorder"));
		//使用静态工厂方法创建EmptyBorder，EmptyBorder就是在组件四周留空
		Border eb = BorderFactory.createEmptyBorder(20 , 5 , 10 , 30);
		jf.add(getPanelWithBorder(eb , "EmptyBorder"));
		//使用静态工厂方法创建EtchecdBorder
		Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED , Color.RED , Color.GREEN);
		jf.add(getPanelWithBorder(etb , "EtchedBorder"));
		//直接创建TitleBorder，TitledBorder就是为原有的边框增加标题
		TitledBorder tb = new TitledBorder(lb , "测试标题" , TitledBorder.LEFT , TitledBorder.BOTTOM ,	
			new Font("StSong" , Font.BOLD , 18) , Color.BLUE);
		jf.add(getPanelWithBorder(tb , "TitledBorder"));
		//直接创建MatteBorder，MatteBorder是EmptyBorder的自子类，
		//它可以置顶留空区域的颜色或背景，此处是指定颜色
		MatteBorder mb = new MatteBorder(20 , 5 , 10 , 30 , Color.GREEN);
		jf.add(getPanelWithBorder(mb , "MatteBorder"));
		//直接创建CompoundBorder，CompoundBorder将两个边框组合成新边框
		CompoundBorder cb = new CompoundBorder(new LineBorder(Color.RED , 8) , tb);
		jf.add(getPanelWithBorder(cb , "CompoundBorder"));
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new BorderTest().init();
	}
	public JPanel getPanelWithBorder(Border b , String BorderName)
	{
		JPanel p = new JPanel();
		p.add(new JLabel(BorderName));
		//为Panel组件设置边框
		p.setBorder(b);
		return p;
	}
}