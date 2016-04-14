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
import java.awt.event.*;
import java.awt.datatransfer.*;
import javax.swing.*;
public class SimpleClipboard
{
	private Frame f = new Frame("�򵥵ļ��������");
	//���ϵͳ������
	private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//�����Ǵ������ؼ�����Ĵ���
	//Clipboard clipboard = new Clipboard("cb");	//1
	//���ڸ����ı����ı���
	private TextArea jtaCopyTo = new TextArea(5 , 20);
	//����ճ���ı����ı���
	private TextArea jtaPaste = new TextArea(5 , 20);
	private Button btCopy = new Button("����");		//���ư�ť
	private Button btPaste = new Button("ճ��");	//ճ����ť
	public void init()
	{
		Panel p = new Panel();
		p.add(btCopy);
		p.add(btPaste);
		btCopy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//��һ�������ı�������ַ����볤��StringSelection����
				StringSelection contents = new StringSelection(jtaCopyTo.getText());
				//��StringSelection��������������
				clipboard.setContents(contents , null);
			}
		});
		btPaste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//����������а���stringFlavor����
				if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
				{
					try
					{
						//ȥ���������е�stringFlavor����
						String content = (String)clipboard.getData(DataFlavor.stringFlavor);
						jtaPaste.append(content);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		//����һ��ˮƽ���е�Box����
		Box box = new Box(BoxLayout.X_AXIS);
		//�����������ı������Box������
		box.add(jtaCopyTo);
		box.add(jtaPaste);
		//����ť���ڵ�Panel��Box������ӵ�Frame������
		f.add(p , BorderLayout.SOUTH);
		f.add(box , BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleClipboard().init();
	}
}