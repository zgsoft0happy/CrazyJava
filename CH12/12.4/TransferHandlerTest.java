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
public class TransferHandlerTest
{
	private JFrame jf = new JFrame("����TransferHandler");
	JColorChooser chooser = new JColorChooser();
	JTextArea txt = new JTextArea("����TransferHandler\n" + "ֱ�ӽ�������ɫ�����Ըı��ı���ɫ");
	public void init()
	{
		//������ɫѡ���������ı�����ϷŹ���
		chooser.setDragEnabled(true);
		txt.setDragEnabled(true);
		jf.add(chooser , BorderLayout.SOUTH);
		//����ֱ�ӽ�һ��Color���������JTextArea����
		//�����������foreground����
		txt.setTransferHandler(new TransferHandler("foreground"));
		jf.add(new JScrollPane(txt));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TransferHandlerTest().init();
	}
}