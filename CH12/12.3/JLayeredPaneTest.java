/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
public class JLayeredPaneTest
{
	JFrame jf = new JFrame("����JlayeredPane");
	JLayeredPane layeredPane = new JLayeredPane();
	public void init()
	{
		//��layeredPane�����3�����
		layeredPane.add(new ContentPanel(10 , 20 , "���Java����" , "ico/java.png") ,
							JLayeredPane.MODAL_LAYER);
		layeredPane.add(new ContentPanel(100 , 60 , "���Android����" , "ico/android.png") , 
							JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(new ContentPanel(190 , 100 , "������Java EE��ҵӦ��ʵս" , "ico/ee.png") , 4);
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
//��չ��JPanel�࣬����ֱ�Ӵ���һ������ָ��λ��
//����ָ���������ָ��ͼ���JPanel����
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