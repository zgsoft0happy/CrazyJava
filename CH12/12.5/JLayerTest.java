/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-28
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
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
		//����͸��Ч��
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER , .5f));
		//ʹ�ý��仭�ʻ�ͼ
		g2.setPaint(new GradientPaint(0 , 0 ,Color.RED , 0 , c.getHeight() , Color.BLUE));
		//����һ���뱻װ�����������ͬ��С�����
		g2.fillRect(0 , 0 , c.getWidth() , c.getHeight());		//1
		g2.dispose();
	}
}
public class JLayerTest
{
	public void init()
	{
		JFrame f = new JFrame("JLayer����");
		JPanel p = new JPanel();
		ButtonGroup group = new ButtonGroup();
		JRadioButton radioButton;
		//����3��RadioButton������������ӳ�һ��
		p.add(radioButton = new JRadioButton("��������" , true));
		group.add(radioButton);
		p.add(radioButton = new JRadioButton("��깺��"));
		group.add(radioButton);
		p.add(radioButton = new JRadioButton("ͼ��ݽ���"));
		group.add(radioButton);
		//���3��JCheckBox
		p.add(new JCheckBox("���Java����"));
		p.add(new JCheckBox("���android����"));
		p.add(new JCheckBox("���Ajax����"));
		p.add(new JCheckBox("������Java EE��ҵӦ��ʵս"));
		JButton orderButton = new JButton("ͶƱ");
		p.add(orderButton);
		//����LayerUI����
		LayerUI<JComponent> layerUI = new FirstLayerUI();		//2
		//ʹ��layerUI��װ��ָ����Jpanel���
		JLayer<JComponent> layer = new JLayer<JComponent>(p , layerUI);
		//��װ�κ��JPanel�����ӵ�������
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