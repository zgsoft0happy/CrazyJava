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
public class NullLayoutTest
{
	Frame f = new Frame("���Դ���");
	Button b1 = new Button("��һ����ť");
	Button b2 = new Button("�ڶ�����ť");
	public void init()
	{
		//����ʹ��null���ֹ�����
		f.setLayout(null);
		//����ǿ������ÿ����ť�Ĵ�С��λ��
		b1.setBounds(20 , 30 , 90 , 28);
		f.add(b1);
		b2.setBounds(50 , 45 , 120 , 35);
		f.add(b2);
		f.setBounds(50 , 50 , 200 , 100);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new NullLayoutTest().init();
	}
}