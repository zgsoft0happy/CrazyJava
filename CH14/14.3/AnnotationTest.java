/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import javax.swing.*;
import java.awt.event.*;
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("ʹ��ע�Ͱ��¼�������");
	//ʹ��AnnotationΪok��ť���¼�������
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok = new JButton("ȷ��");
	//ʹ��AnnotationΪcancel��ť���¼�������
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel = new JButton("ȡ��");
	public void init()
	{
		//��ʼ������ķ���
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);	//	1
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new AnnotationTest().init();
	}
}
//����ok��ť��ʱ�������ʵ����
class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȷ����ť");
	}
}
//����cancel��ť���¼�������ʵ����
class CancelListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȡ����ť");
	}
}