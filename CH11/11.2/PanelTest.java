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
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
public class PanelTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		//����һ��Panel����
		Panel p = new Panel();
		//��Panel����������������
		p.add(new TextField(20));
		p.add(new Button("������"));
		//��Penal������ӵ�Frame������
		f.add(p);
		//���ô��ڵĴ�С��λ��
		f.setBounds(30 , 30 , 250 , 120);
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}