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
public class GridLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("������");
		Panel p1 = new Panel();
		p1.add(new TextField(3));
		f.add(p1 , BorderLayout.NORTH);
		Panel p2 = new Panel();
		//����Panelʹ��GridLayout���ֹ�����
		p2.setLayout(new GridLayout(3 , 4 , 4 , 4));
		String[] name = {"0" , "1" , "2" , "3" , "4" , "5" , "6"
			, "7" , "8" , "9" , "+" , "-" , "*" , "/" , "."};
		//��Panel���������15����ť
		for (int i = 0 ; i < name.length ; i++)
		{
			p2.add(new Button(name[i]));
		}
		//Ĭ�Ͻ�Panel������ӵ�Frame���ڵ��м�
		f.add(p2);
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ����
		f.setVisible(true);
	}
}