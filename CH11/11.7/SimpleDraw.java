/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class SimpleDraw 
{
	private final String RECT_SHAPE = "rect";
	private final String OVAL_SHAPE = "oval";
	private Frame f = new Frame("����");
	private Button rect = new Button("���ƾ���");
	private Button oval = new Button("����Բ��");
	private MyCanvas drawArea = new MyCanvas();
	//���ڱ�����Ҫ����ʲôͼ�εı���
	private String shape = "";
	public void init()
	{
		Panel p = new Panel();
		rect.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//����shape����ΪRECT_SHAPE
				shape =RECT_SHAPE;
				//�ػ�MyCanvas���󣬼���������update()����
				drawArea.repaint();
			}
		});
		oval.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//����shape����ΪOVAL_SHAPE
				shape = OVAL_SHAPE;
				//�ػ�MyCanvas���󣬼���������update()����
				drawArea.repaint();
			}
		});
		p.add(rect);
		p.add(oval);
		drawArea.setPreferredSize(new Dimension(250 , 180));
		f.add(drawArea);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleDraw().init();
	}
	class MyCanvas extends Canvas
	{
		//���Canvas��paint()������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			Random rand = new Random();
			if (shape.equals(RECT_SHAPE))
			{
				//���û�����ɫ
				g.setColor(new Color(220 , 100 , 80));
				//����ػ���һ�����ο�
				g.drawRect(rand.nextInt(200) , rand.nextInt(120), 40 ,60);
			}
			if (shape.equals(OVAL_SHAPE))
			{
				//���û�����ɫ
				g.setColor(new Color(80 , 100 , 200));
				//��������һ��ʵ��Բ��
				g.fillOval(rand.nextInt(200) , rand.nextInt(120) , 50 ,40);
			}
		}
	}
}