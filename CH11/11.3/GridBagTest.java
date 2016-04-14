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
public class GridBagTest
{
	private Frame f = new Frame("���Դ���");
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] bs = new Button[10];
	public void init()
	{
		f.setLayout(gb);
		for (int i = 0 ; i < bs.length ; i++)
		{
			bs[i] = new Button("��ť" + i);
		}
		//��������������ں�������������
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[3]);
		//��GridBagConstraints���Ƶ�GUI������ں����ϲ�������
		gbc.weightx = 0;
		addButton(bs[4]);
		//��GridBagConstraints���Ƶ�GUI����������������
		gbc.gridwidth = 2;
		addButton(bs[5]);
		//��GridBagConstraints���Ƶ�GUI��������һ������
		gbc.gridwidth = 1;
		//��GridBagConstraints���Ƶ�GUI������������Ͽ�Խ��������
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[6]);
		//��GridBagConstraints���Ƶ�GUI������������hһ�����������Խ��������
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI��������������Ȩ����1
		gbc.weighty = 1;
		addButton(bs[7]);
		//��������İ�ť�������ϲ�������
		gbc.weighty = 0;
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		//��GridBagConstraints���Ƶ�GUI������������Ϻ��һ������
		gbc.gridheight = 1;
		addButton(bs[8]);
		addButton(bs[9]);
		f.pack();
		f.setVisible(true);
	}
	private void addButton(Button button)
	{
		gb.setConstraints(button , gbc);
		f.add(button);
	}
	public static void main(String[] args)
	{
		new GridBagTest().init();
	}
}