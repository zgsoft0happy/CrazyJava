/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-29
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.event.*;
import java.beans.*;
class WaitingLayerUI extends LayerUI<JComponent>
{
	private boolean isRunning;
	private Timer timer;
	//记录转过的角度
	private int angle;		//1
	public void paint(Graphics g , JComponent c)
	{
		super.paint(g , c);
		int w = c.getWidth();
		int h = c.getHeight();
		//已经停止运行，直接返回
		if (!isRunning) return ;
		Graphics2D g2 = (Graphics2D)g.create();
		Composite urComposite = g2.getComposite();
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , .5f));
		//填充矩形
		g2.fillRect(0 , 0 , w , h);
		g2.setComposite(urComposite);
		//------下面代码开始绘制转动中的“齿轮”-------
		//计算得到宽、高中较小值得1、5
		int s = Math.min(w , h) / 5;
		int cx = w / 2;
		int cy = h /2;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		//设置触笔
		g2.setStroke(new BasicStroke(s / 2 , BasicStroke.CAP_ROUND , BasicStroke.JOIN_ROUND));
		g2.setPaint(Color.BLUE);
		//画笔绕被装饰组件的中心装过angle度
		g2.rotate(Math.PI * angle / 180 , cx , cy);	//2
		//循环绘制12条下调，形成"齿轮"
		for (int i = 0 ; i < 12 ; i++)
		{
			float sale = (11.0f - (float)i) / 11.0f;
			g2.drawLine(cx + s , cy , cx + s * 2 , cy);
			g2.rotate(-Math.PI / 6 , cx , cy);
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , sale));
		}
		g2.dispose();
	}
	//控制等待（齿轮开始转动）的方法
	public void start()
	{
		//如果已经在运行中，直接返回
		if (isRunning) return ;
		isRunning = true;
		//每隔0.1秒重绘一次
		timer = new Timer(100 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isRunning)
				{
					//出发applyPropertyChange()方法，让JLayer重绘
					firePropertyChange("crazyitFlag" , 0 , 1);
					//角度加6
					angle += 6;	//3
					//到达360角度后再从0 开始
					if (angle >= 360)
						angle = 0;
				}
			}
		});
		timer.start();
	}
	//控制停止等待（齿轮停止转动）的方法
	public void stop()
	{
		isRunning = false;
		//最后通知JLayer重绘一次，清楚曾经绘制的图形
		firePropertyChange("crazyitFlag" , 0 , 1);
		timer.stop();
	}
	public void applyPropertyChange(PropertyChangeEvent pce , JLayer layer)
	{
		//控制JLayer重绘
		if (pce.getPropertyName().equals("crazyitFlag"))
		{
			layer.repaint();
		}
	}
}