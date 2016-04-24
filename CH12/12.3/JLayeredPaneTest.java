/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
public class JLayeredPaneTest
{
	JFrame jf = new JFrame("测试JlayeredPane");
	JLayeredPane layeredPane = new JLayeredPane();
	public void init()
	{
		//向layeredPane中添加3个组件
		layeredPane.add(new ContentPanel(10 , 20 , "疯狂Java讲义" , "ico/java.png") ,
							JLayeredPane.MODAL_LAYER);
		layeredPane.add(new ContentPanel(100 , 60 , "疯狂Android讲义" , "ico/android.png") , 
							JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(new ContentPanel(190 , 100 , "轻量级Java EE企业应用实战" , "ico/ee.png") , 4);
		layeredPane.setPreferredSize(new Dimension(400 , 300));
		layeredPane.setVisible(true);
		jf.add(layeredPane);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JLayeredPaneTest().init();
	}
}
//扩展了JPanel类，可以直接创建一个放在指定位置
//且有指定标题放置指定图标的JPanel对象
class ContentPanel extends JPanel
{
	public ContentPanel(int xPos , int yPos , String title , String ico)
	{
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder() , title));
		JLabel label = new JLabel(new ImageIcon(ico));
		add(label);
		setBounds(xPos , yPos , 160 , 220);		//1
	}
}