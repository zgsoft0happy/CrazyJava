/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-15   Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import javax.swing.text.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
public class JTextPaneTest
{
	JFrame mainWin = new JFrame("����JTextPane");
	JTextPane txt = new JTextPane();
	StyledDocument doc = txt.getStyledDocument();
	//����3��SimpleAttributeSet����
	SimpleAttributeSet android = new SimpleAttributeSet();
	SimpleAttributeSet java = new SimpleAttributeSet();
	SimpleAttributeSet javaee = new SimpleAttributeSet();
	public void init()
	{
		//Ϊandroid���Լ�������ɫ�������С��������»���
		StyleConstants.setForeground(android , Color.RED);
		StyleConstants.setFontSize(android , 24);
		StyleConstants.setFontFamily(android , "Dialog");
		StyleConstants.setUnderline(android , true);
		//Ϊjava���Լ�������ɫ�������С������ʹ�����
		StyleConstants.setForeground(java , Color.BLUE);
		StyleConstants.setFontSize(java , 30);
		StyleConstants.setFontFamily(java , "Arial Black");
		StyleConstants.setBold(java , true);
		//Ϊjavaee���Լ�������ɫ�������С��б����
		StyleConstants.setForeground(javaee , Color.GREEN);
		StyleConstants .setFontSize(javaee , 32);
		StyleConstants.setItalic(javaee , true);
		//���ò�����༭
		txt.setEditable(false);
		txt.setText("���Android����\n���Java����\n������Java EE��ҵӦ��ʵս\n");
		//�ֱ�Ϊ�ĵ���3���������ò�ͬ�������ʽ
		doc.setCharacterAttributes(0 , 12 , android , true);
		doc.setCharacterAttributes(12 , 12 , java , true);
		doc.setCharacterAttributes(24 , 30 , javaee , true);
		mainWin.add(new JScrollPane(txt) , BorderLayout.CENTER);
		//��ȡ��Ļ�ߴ�
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int inset = 100;
		//���������ڵĴ�С
		mainWin.setBounds(inset , inset , screenSize.width - inset * 2 , screenSize.height - inset * 2);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JTextPaneTest().init();
	}
}