/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-28
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;
class FirstLayerUI extends LayerUI<JComponent>
{
	public void paint(Graphics g , JComponent c)
	{
		super.paint(g , c);
		Graphics2D g2 = (Graphics2D) g.create();
		//设置透明效果
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , .5f));
		//使用渐变画笔绘图
		g2.setPaint(new GradientPaint(0 , 0 ,Color.RED , 0 , c.getHeight() , Color.BLUE));
		//绘制一个与被装饰组件具有相同大小的组件
		g2.fillRect(0 , 0 , c.getWidth() , c.getHeight());		//1
		g2.dispose();
	}
}
public class JLayerTest
{
	public void init()
	{
		JFrame f = new JFrame("JLayer测试");
		JPanel p = new JPanel();
		ButtonGroup group = new ButtonGroup();
		JRadioButton radioButton;
		//创建3个RadioButton，并将它们添加成一组
		p.add(radioButton = new JRadioButton("网购购买" , true));
		group.add(radioButton);
		p.add(radioButton = new JRadioButton("书店购买"));
		group.add(radioButton);
		p.add(radioButton = new JRadioButton("图书馆借阅"));
		group.add(radioButton);
		//添加3个JCheckBox
		p.add(new JCheckBox("疯狂Java讲义"));
		p.add(new JCheckBox("疯狂android讲义"));
		p.add(new JCheckBox("疯狂Ajax讲义"));
		p.add(new JCheckBox("轻量级Java EE企业应用实战"));
		JButton orderButton = new JButton("投票");
		p.add(orderButton);
		//创建LayerUI对象
		LayerUI<JComponent> layerUI = new FirstLayerUI();		//2
		//使用layerUI来装饰指定的Jpanel组件
		JLayer<JComponent> layer = new JLayer<JComponent>(p , layerUI);
		//将装饰后的JPanel组件添加到容器中
		f.add(layer);
		f.setSize(300 , 170);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JLayerTest().init();
	}
}