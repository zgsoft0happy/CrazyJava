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
public class FlowLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��FlowLayout���ֹ�����
		f.setLayout(new FlowLayout(FlowLayout.LEFT , 20 , 5));
		//�򴰿������10����ť
		for (int i = 0 ; i < 10 ; i++)
		{
			f.add(new Button("��ť" + i));
		}
		//���ô��ڴ�СΪ���
		f.pack();
		//��������ʾ����(Frame����Ĭ�ϴ�������״̬)
		f.setVisible(true);
	}
}