/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-20
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.text.*;
import javax.swing.undo.*;
public class JFormattedTextFieldTest
{
	private JFrame mainWin = new JFrame("���Ը�ʽ���ı���");
	private JButton okButton = new JButton("ȷ��");
	//����������Ӹ�ʽ���ı��������
	private JPanel mainPanel = new JPanel();
	JFormattedTextField[] fields = new JFormattedTextField[6];
	String[] behaviorLabels = new String[]
	{
		"COMMIT",
		"COMMIT_OR_REVERT",
		"PERSIST",
		"REVERT"
	};
	int[] behaviors = new int[]
	{
		JFormattedTextField.COMMIT,
		JFormattedTextField.COMMIT_OR_REVERT,
		JFromattedTextField.PESIST,
		JFromattedTextField.REVERT
	};
	ButtonGroup bg = new ButtonGroup();
	public void init()
	{
		//��Ӱ�ť
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		mainPanel.setLayout(new GridLayout(0 , 3));
		mainWin.add(mainPanel , BorderLayout.CENTER);
		//ʹ��NumberFormat��integerInstance����һ��JformattedTextField����
		fields[0] = new JFormattedTextField(NumberFormat.getIntegerInstance());
		//���ó�ʼֵ
		fields[0].setValue(100);
		addRow("������ʽ�ı���" , fields[0]);
		//ʹ��NumberFormat��currencyInstance����һ��JFormattedTextField����
		fields[1] = new JFormattedTextField(NumberFormat.getCurrencyInstance());
		fields[1].setValue(100.0);
		addRow("���Ҹ�ʽ�ı���" , fields[1]);
		//ʹ��Ĭ�ϵ����ڸ�ʽ����һ��JFormattedTextField����
		fields[2] = new JFormattedTextField(DateFormat.getDateInstance());
		fields[2].setValue(new Date());
		addRow("Ĭ�ϵ����ڸ�ʽ����" , fields[2]);
		//ʹ��SHORT���͵����ڸ�ʽ����һ��JFormattedTextField����
		//��Ҫ������ϸ����ڸ�ʽ
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		//Ҫ������ϸ�����ڸ�ʽ�﷨
		format.setLenient(false);
		fields[3] = new JFormattedTextField(format);
		fields.setValue(new Date());
		add
	}
}