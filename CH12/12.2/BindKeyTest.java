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
import java.awt.*;
import java.awt.event.*;
public class BindKeyTest
{
	JFrame jf = new JFrame("���Լ��̰�");
	JTextArea jta= new JTextArea(5 , 30);
	JButton jb = new JButton("����");
	JTextField jtf = new JTextField(15);
	public void init()
	{
		jf.add(jta);
		JPanel jp = new JPanel();
		jp.add(jtf);
		jp.add(jb);
		jf.add(jp , BorderLayout.SOUTH);
		//������Ϣ��Action��Action��ActionListener���ӽӿ�
		Action sendMsg = new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append(jtf.getText() +"\n");
				jtf.setText("");
			}
		};
		//����¼�������
		jb.addActionListener(sendMsg);
		//��Ctrl+Enter����"send"����
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n' , java.awt.event.InputEvent.CTRL_MASK) , "send");
		//��"send"��sendMsg Action����
		jtf.getActionMap().put("send" , sendMsg);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new BindKeyTest().init();
	}
}