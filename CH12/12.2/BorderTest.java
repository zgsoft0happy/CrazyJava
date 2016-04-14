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
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class BorderTest
{
	private JFrame jf = new JFrame("���Ա߿�");
	public void init()
	{
		jf.setLayout(new GridLayout(2 , 4));
		//ʹ�þ�̬������������BevelBorder
		Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED , Color.RED , 
			Color.GREEN , Color.BLUE , Color.GRAY);
		jf.add(getPanelWithBorder(bb , "BevelBorder"));
		//ʹ�þ�̬������������LineBorder
		Border lb = BorderFactory.createLineBorder(Color.ORANGE , 10);
		jf.add(getPanelWithBorder(lb , "LineBorder"));
		//ʹ�þ�̬������������EmptyBorder��EmptyBorder�����������������
		Border eb = BorderFactory.createEmptyBorder(20 , 5 , 10 , 30);
		jf.add(getPanelWithBorder(eb , "EmptyBorder"));
		//ʹ�þ�̬������������EtchecdBorder
		Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED , Color.RED , Color.GREEN);
		jf.add(getPanelWithBorder(etb , "EtchedBorder"));
		//ֱ�Ӵ���TitleBorder��TitledBorder����Ϊԭ�еı߿����ӱ���
		TitledBorder tb = new TitledBorder(lb , "���Ա���" , TitledBorder.LEFT , TitledBorder.BOTTOM ,	
			new Font("StSong" , Font.BOLD , 18) , Color.BLUE);
		jf.add(getPanelWithBorder(tb , "TitledBorder"));
		//ֱ�Ӵ���MatteBorder��MatteBorder��EmptyBorder�������࣬
		//�������ö������������ɫ�򱳾����˴���ָ����ɫ
		MatteBorder mb = new MatteBorder(20 , 5 , 10 , 30 , Color.GREEN);
		jf.add(getPanelWithBorder(mb , "MatteBorder"));
		//ֱ�Ӵ���CompoundBorder��CompoundBorder�������߿���ϳ��±߿�
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
		//ΪPanel������ñ߿�
		p.setBorder(b);
		return p;
	}
}