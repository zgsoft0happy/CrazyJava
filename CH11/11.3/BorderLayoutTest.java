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
public class BorderLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��BorderrLayout���ֹ�����
		f.setLayout(new BorderLayout(30 , 5));
		f.add(new Button("��") , BorderLayout.SOUTH);
		f.add(new Button("��") , BorderLayout.NORTH);
		//Ĭ����ӵ��м�������
		f.add(new Button("��"));
		f.add(new Button("��") , BorderLayout.EAST);
		f.add(new Button("��") , BorderLayout.WEST);
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ����
		f.setVisible(true);
	}
}