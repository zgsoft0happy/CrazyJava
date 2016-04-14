/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-19
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
public class HandDraw
{
	//��ͼ���Ŀ��
	private final int AREA_WIDTH = 500;
	//��ͼ���ĸ߶�
	private final int AREA_HEIGHT = 400;
	//�����preX��preY��������һ������϶�ʱ����������
	private int preX = -1;
	private int preY = -1;
	//����һ���Ҽ��˵��������û�����ɫ
	JPopupMenu pop = new JPopupMenu();
	JMenuItem chooseColor = new JMenuItem("ѡ����ɫ");
	//����һ��BufferedImage����
	BufferedImage image = new BufferedImage(AREA_WIDTH , AREA_HEIGHT , BufferedImage.TYPE_INT_RGB);
	//��ȡimage�����Graphics
	Graphics g = image.getGraphics();
	private JFrame f = new JFrame("���ֻ����");
	private DrawCanvas drawArea = new DrawCanvas();
	//���ڱ��滭����ɫ
	private Color foreColor = new Color(255 , 0 , 0);
	public void init()
	{
		chooseColor.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				//�������ֱ�ӵ���һ��ģʽ����ɫѡ��Ի��򣬲������û�ѡ�����ɫ
				//foreColor = JColorChooser.showDialog(f , "ѡ�񻭱���ɫ" , foreColor);		//1
				//��������򵯳�һ����ģʽ����ɫѡ��Ի���
				//�����Էֱ�Ϊ"ȷ��"��ť��"ȡ��"��ť�ƶ��¼�������
				final JColorChooser colorPane = new JColorChooser(foreColor);
				JDialog jd = JColorChooser.createDialog(f , "ѡ�񻭱���ɫ" , false , colorPane , new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						foreColor = colorPane.getColor();
					}
				}, null);
				jd.setVisible(true);
			}
		});
		//���˵�����ϳ��Ҽ��˵�
		pop.add(chooseColor);
		//���Ҽ��˵���ӵ�drawArea������
		drawArea.setComponentPopupMenu(pop);
		//��image����ı���ɫ���ɰ�ɫ
		g.fillRect(0 , 0 , AREA_WIDTH , AREA_HEIGHT);
		drawArea.setPreferredSize(new Dimension(AREA_WIDTH , AREA_HEIGHT));
		//��������ƶ�����
		drawArea.addMouseMotionListener(new MouseMotionAdapter()
		{
			//ʵ�ְ����������϶����¼�������
			public void mouseDragged(MouseEvent e)
			{
				//���preX��preY����0
				if (preX > 0 && preY > 0)
				{
					//���õ�ǰ��ɫ
					g.setColor(foreColor);
					//���ƴ���һ������϶��¼��㵽��������϶��¼�����߶�
					g.drawLine(preX , preY , e.getX() , e.getY());
				}
				//����ǰ����¼����X��Y���걣������
				preX = e.getX();
				preY = e.getY();
				//�ػ�drawArea����
				drawArea.repaint();
			}
		});
		//��������¼�
		drawArea.addMouseListener(new MouseAdapter()
		{
			//ʵ������ɿ����¼�������
			public void mouseReleased(MouseEvent e)
			{
				//�ɿ�����ʱ������һ������϶��¼���X��Y������Ϊ-1
				preX = -1;
				preY = -1;
			}
		});
		f.add(drawArea);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new HandDraw().init();
	}
	//�û�ͼ����̳�JPanel��
	class DrawCanvas extends JPanel
	{
		//��дJPanel��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			//��image��֪���������
			g.drawImage(image , 0 , 0 ,null);
		}
	}
}