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
import javax.swing.*;
public class CommonComponent
{
	Frame f = new Frame("����");
	//����һ����ť
	Button ok = new Button("ȷ��");
	CheckboxGroup cbg = new CheckboxGroup();
	//����һ����ѡ��(����cbgһ��)����ʼ����ѡ��״̬
	Checkbox male = new Checkbox("��" , cbg , true);
	//����һ����ѡ�򣨴���cbgһ�飩����ʼ����û��ѡ��״̬
	Checkbox female = new Checkbox("Ů" , cbg , false);
	//����һ����ѡ�򣬳�ʼ����û��ѡ��״̬
	Checkbox married = new Checkbox("�Ƿ��ѻ飿" , false);
	//����һ������ѡ���
	Choice colorChooser = new Choice();
	//����һ���б�ѡ���
	List colorList = new List(6 , true);
	//����һ��5�С�20�еĶ����ı���
	TextArea ta = new TextArea(5 , 20);
	//����һ��50�еĵ����ı���
	TextField name = new TextField(50);
	public void init()
	{
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		//����һ��װ�����ı��򡢰�ť��Panel
		Panel bottom = new Panel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom , BorderLayout.SOUTH);
		//����һ��װ��������ѡ�������Checkbox��Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		//����һ����ֱ���������Box��ʢװ�����ı���Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		//����һ��ˮƽ���������Box��ʢװtopLeft\colorList
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		//��top Box������ӵ����ڵ��м�
		f.add(top);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CommonComponent().init();
	}
}