/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-15
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
public class MonitorText
{
	JFrame mainWin = new JFrame("����Document����");
	JTextArea target = new JTextArea(4 , 35);
	JTextArea msg = new JTextArea(5 , 35);
	JLabel label = new JLabel("�ı�����޸���Ϣ");
	Document doc = target.getDocument();
	//���泷��������List����
	LinkedList<UndoableEdit> undoList = new LinkedList<>();
	//�������������
	final int UNDO_COUNT = 20;
	public void init()
	{
		msg.setEditable(false);
		//���DocumentListener
		doc.addDocumentListener(new DocumentListener()
		{
			//��Document�����Ի����Լ������˱仯ʱ�����÷���
			public void changedUpdate(DocumentEvent e){}
			//����Document�в����ı�ʱ�����÷���
			public void insertUpdate(DocumentEvent e)
			{
				int offset = e.getOffset();
				int len = e.getLength();
				//ȡ�ò����¼���λ��
				msg.append("�����ı��ĳ��ȣ�" + len + "\n");
				msg.append("�����ı�����ʼλ�ã�" + offset + "\n");
				try
				{
					msg.append("�����ı�����:" + doc.getText(offset , len) + "\n");
				}
				catch (BadLocationException evt)
				{
					evt.printStackTrace();
				}
			}
			//����Document��ɾ���ı�ʱ�����÷���
			public void removeUpdate(DocumentEvent e)
			{
				int offset = e.getOffset();
				int len = e.getLength();
				//ȡ�ò����¼���λ��
				msg.append("ɾ���ı��ĳ��ȣ�"  + len + "\n");
				msg.append("ɾ���ı�����ʼλ�ã�" + offset + "\n");
			}
		});
		//��ӿɳ��������ļ�����
		doc.addUndoableEditListener(new UndoableEditListener()
		{
			//ÿ�η����ɳ�������ʱ���ᴥ���÷���
			public void undoableEditHappened(UndoableEditEvent e)		//1
			{
				UndoableEdit edit = e.getEdit();
				if (edit.canUndo() && undoList.size() < UNDO_COUNT)
				{
					//����������װ��List��
					undoList.add(edit);
				}
				//�Ѿ��ﵽ�����������
				else if (edit.canUndo() && undoList.size() >= UNDO_COUNT)
				{
					//������һ����������
					undoList.pop();
					//����������װ��List��
					undoList.add(edit);
				}
			}
		});
		//Ϊ"Ctrl+z"������Ӽ�����
		target.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)		//2
			{
				//���������"Ctrl+z"
				if (e.getKeyChar() == 26)
				{
					if (undoList.size() > 0)
					{
						//�Ƴ����һ���ɳ�����������ȡ���ò���
						undoList.removeLast().undo();
					}
				}
			}
		});
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(new JScrollPane(target));
		JPanel panel = new JPanel();
		panel.add(label);
		box.add(new JScrollPane(msg));
		mainWin.add(box);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MonitorText().init();
	}
}