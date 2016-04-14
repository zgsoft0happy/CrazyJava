/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-30
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Vector;
import javax.swing.event.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
public class ListTest
{
	private JFrame mainWin = new JFrame("�����б��");
	String[] books = new String[]
	{
		"���Java����",
		"������Java EE��ҵӦ��ʵս",
		"���Android����",
		"���Ajax����",
		"����Java EE��ҵӦ��ʵս"
	};
	//��һ���ַ�������������һ��JList����
	JList<String> bookList = new JList<>(books);
	JComboBox<String> bookSelector;
	//���岼��ѡ��ť���ڵ����
	JPanel layoutPanel = new JPanel();
	ButtonGroup layoutGroup = new ButtonGroup();
	//����ѡ��ģʽ��ť���ڵ����
	JPanel selectModePanel = new JPanel();
	ButtonGroup selectModeGroup = new ButtonGroup();
	JTextArea favoriate = new JTextArea(4 , 40);
	public void init()
	{
		//JList�Ŀ��Ӹ߶ȿ�ͬʱ��ʾ3���б���
		bookList.setVisibleRowCount(3);
		//Ĭ��ѡ�е�3���5�򣨵�1���������0��
		bookList.setSelectionInterval(2 , 4);
		addLayoutButton("�������" , JList.VERTICAL);
		addLayoutButton("������" , JList.VERTICAL_WRAP);
		addLayoutButton("������" , JList.HORIZONTAL_WRAP);
		addSelectModelButton("������" , ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		addSelectModelButton("��ѡ" , ListSelectionModel.SINGLE_SELECTION);
		addSelectModelButton("����Χ" , ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		Box listBox = new Box(BoxLayout.Y_AXIS);
		//��JList�������JScrollPane�У��ٽ���JScrollPane���listBox������
		listBox.add(new JScrollPane(bookList));
		//��Ӳ���ѡ��ť��塢ѡ��ģʽ��ť���
		listBox.add(layoutPanel);
		listBox.add(selectModePanel);
		//ΪJList����¼�������
		bookList.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)		//1
			{
				//��ȡ�û���ѡ������е�ͼ��
				List<String> books = bookList.getSelectedValuesList();
				favoriate.setText("");
				for (String book : books)
				{
					favoriate.append(book + "\n");
				}
			}
		});
		Vector<String> bookCollection = new Vector<>();
		bookCollection.add("���Java����");
		bookCollection.add("������Java EE��ҵӦ��ʵս");
		bookCollection.add("���Android����");
		bookCollection.add("���Ajax����");
		bookCollection.add("����Java EE��ҵӦ��ʵս");
		//��һ��Vector����������һ��JComboBox����
		bookSelector = new JComboBox<>(bookCollection);
		//ΪJComboBox����¼�������
		bookSelector.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)		//2
			{
				//��ȡJComboBox��ѡ�е���
				Object book = bookSelector.getSelectedItem();
				favoriate.setText(book.toString());
			}
		});
		//���ÿ���ֱ�ӱ༭
		bookSelector.setEditable(true);
		//���������б��Ŀ��Ӹ߶ȿ�ͬʱ��ʾ4���б���
		bookSelector.setMaximumRowCount(4);
		JPanel p = new JPanel();
		p.add(bookSelector);
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(listBox);
		box.add(p);
		mainWin.add(box);
		JPanel favoriatePanel = new JPanel();
		favoriatePanel.setLayout(new BorderLayout());
		favoriatePanel.add(new JScrollPane(favoriate));
		favoriatePanel.add(new JLabel("��ϲ����ͼ�飺") , BorderLayout.NORTH);
		mainWin.add(favoriatePanel , BorderLayout.SOUTH);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	private void addLayoutButton(String label , final int orientation)
	{
		layoutPanel.setBorder(new TitledBorder(new EtchedBorder() , "ȷ��ѡ�񲼾�"));
		JRadioButton button = new JRadioButton(label);
		//�Ѹõ�ѡ��ť��ӵ�layoutPanel�����
		layoutPanel.add(button);
		//Ĭ��ѡ�е�һ����ť
		if (layoutGroup.getButtonCount() == 0)
		button.setSelected(true);
		layoutGroup.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//�ı��б�����ѱ���Ĳ��ַ���
				bookList.setLayoutOrientation(orientation);
			}
		});
	}
	private void addSelectModelButton(String label , final int selectModel)
	{
		selectModePanel.setBorder(new TitledBorder(new EtchedBorder() , "ȷ��ѡ��ģʽ"));
		JRadioButton button = new JRadioButton(label);
		//�Ѹõ�ѡ��ť��ӵ�selectModePanel�����
		selectModePanel.add(button);
		//Ĭ��ѡ���һ����ť
		if (selectModeGroup.getButtonCount() == 0)
			button.setSelected(true);
		selectModeGroup.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//�ı��б�����ѡ��ģʽ
				bookList.setSelectionMode(selectModel);
			}
		});
	}
	public static void main(String[] args)
	{
		new ListTest().init();
	}
}