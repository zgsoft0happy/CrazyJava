/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-29
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
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
	//��¼ת���ĽǶ�
	private int angle;		//1
	public void paint(Graphics g , JComponent c)
	{
		super.paint(g , c);
		int w = c.getWidth();
		int h = c.getHeight();
		//�Ѿ�ֹͣ���У�ֱ�ӷ���
		if (!isRunning) return ;
		Graphics2D g2 = (Graphics2D)g.create();
		Composite urComposite = g2.getComposite();
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , .5f));
		//������
		g2.fillRect(0 , 0 , w , h);
		g2.setComposite(urComposite);
		//------������뿪ʼ����ת���еġ����֡�-------
		//����õ������н�Сֵ��1��5
		int s = Math.min(w , h) / 5;
		int cx = w / 2;
		int cy = h /2;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		//���ô���
		g2.setStroke(new BasicStroke(s / 2 , BasicStroke.CAP_ROUND , BasicStroke.JOIN_ROUND));
		g2.setPaint(Color.BLUE);
		//�����Ʊ�װ�����������װ��angle��
		g2.rotate(Math.PI * angle / 180 , cx , cy);	//2
		//ѭ������12���µ����γ�"����"
		for (int i = 0 ; i < 12 ; i++)
		{
			float sale = (11.0f - (float)i) / 11.0f;
			g2.drawLine(cx + s , cy , cx + s * 2 , cy);
			g2.rotate(-Math.PI / 6 , cx , cy);
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , sale));
		}
		g2.dispose();
	}
	//���Ƶȴ������ֿ�ʼת�����ķ���
	public void start()
	{
		//����Ѿ��������У�ֱ�ӷ���
		if (isRunning) return ;
		isRunning = true;
		//ÿ��0.1���ػ�һ��
		timer = new Timer(100 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isRunning)
				{
					//����applyPropertyChange()��������JLayer�ػ�
					firePropertyChange("crazyitFlag" , 0 , 1);
					//�Ƕȼ�6
					angle += 6;	//3
					//����360�ǶȺ��ٴ�0 ��ʼ
					if (angle >= 360)
						angle = 0;
				}
			}
		});
		timer.start();
	}
	//����ֹͣ�ȴ�������ֹͣת�����ķ���
	public void stop()
	{
		isRunning = false;
		//���֪ͨJLayer�ػ�һ�Σ�����������Ƶ�ͼ��
		firePropertyChange("crazyitFlag" , 0 , 1);
		timer.stop();
	}
	public void applyPropertyChange(PropertyChangeEvent pce , JLayer layer)
	{
		//����JLayer�ػ�
		if (pce.getPropertyName().equals("crazyitFlag"))
		{
			layer.repaint();
		}
	}
}