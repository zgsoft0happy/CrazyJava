/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.Map;
import java.util.LinkedHashMap;
import javax.swing.event.*;
public class JTabbedPaneTest
{
	JFrame jf = new JFrame("����Tabҳ��");
	//�ƽ�һ��Tabҳ��ı�ǩ������ߣ����û��в��ֲ��Ե�JtabbedPane
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT , JTabbedPane.WRAP_TAB_LAYOUT);
	ImageIcon icon = new ImageIcon("ico/close.gif");
	String[] layouts = {"���в���" , "����������"};
	String[] positions = {"���" , "����" , "�ұ�" , "�ײ�"};
	Map<String , String> books = new LinkedHashMap<>();
	public void init()
	{
		books.put("���Java����" , "java.png");
		books.put("������Java EE��ҵӦ��ʵս" , "ee.png");
		books.put("���Ajax����" , "ajax.png");
		books.put("���Android����" , "android.png");
		books.put("����Java EE��ҵӦ��ʵս" , " classic.png");
		String tip = "�ɿ�������ķ�����Ƭ";
		//��JTabbedPane�����5����ǩҳ��ָ���˱��⡢ͼ�����ʾ
		//���ñ�ǩҳ�����Ϊnull
		for (String bookName : books.keySet())
		{
			tabbedPane.addTab(bookName , icon , null , tip);
		}
		jf.add(tabbedPane , BorderLayout.CENTER);
		//ΪJTabbedPane����¼�������
		tabbedPane.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent event)
			{
				//�����ѡ��������Ȼ�ǿ�
				if (tabbedPane.getSelectedComponent() == null)
				{
					//��ȡ��ѡ��ǩҳ
					int  n = tabbedPane.getSelectedIndex();
					//δָ����ǩҳ��������
					loadTab(n);
				}
			}
		});
		//ϵͳĬ��ѡ���һҳ�����ص�һҳ����
		loadTab(0);
		tabbedPane.setPreferredSize(new Dimension( 500 ,300));
		//���ӿ��Ʊ�ǩ���֣���ǩλ�õĵ�ѡ��ť
		JPanel buttonPanel = new JPanel();
		ChangeAction action = new ChangeAction();
		buttonPanel.add(new ButtonPanel(action , "ѡ���ǩ���ֲ���" , layouts));
		buttonPanel.add(new ButtonPanel(action , "ѡ���ǩλ��" , positions));
		jf.add(buttonPanel , BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	//Ϊָ����ǩҳ��������
	private void loadTab(int n)
	{
		String title = tabbedPane.getTitleAt(n);
		//���ݱ�ǩ�صı����ȡ��Ӧ��ͼ�����
		ImageIcon bookImage = new ImageIcon("ico/" + books.get(title));
		tabbedPane.setComponentAt(n , new JLabel(bookImage));
		//�ı��ǩҳ��ͼ��
		tabbedPane.setIconAt(n , new ImageIcon("ico/open.gif"));
	}
	//����ı��ǩҳ�Ĳ��ֲ��ԡ�����λ�õļ�����
	class ChangeAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JRadioButton source = (JRadioButton)event.getSource();
			String selection = source.getActionCommand();
			//���ñ�ǩҳ�ı��Ⲽ�ֲ���
			if (selection.equals(layouts[0]))
			{
				tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
			}
			else if (selection.equals(layouts[1]))
			{
				tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			}
			//���ñ�ǩҳ�ı����λ��
			else if (selection.equals(positions[0]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.LEFT);
			}
			else if (selection.equals(positions[1]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.TOP);
			}
			else if (selection.equals(positions[2]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
			}
			else if (selection.equals(positions[3]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
			}
		}
	}
	public static void main(String[] args)
	{
		new JTabbedPaneTest().init();
	}
}
//����һ��JPanel����չ�࣬����Ķ����������������е�JRadioButton�ռ�
//��JPanel��չ������ö�һ���ַ�����ΪTitledBorder
class ButtonPanel extends JPanel
{
	private ButtonGroup group;
	public ButtonPanel(JTabbedPaneTest.ChangeAction action , String title , String[] labels)
	{
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder() , title));
		setLayout(new BoxLayout(this , BoxLayout.X_AXIS));
		group = new ButtonGroup();
		for (int i = 0 ; labels != null && i < labels.length ; i++)
		{
			JRadioButton b = new JRadioButton(labels[i]);
			b.setActionCommand(labels[i]);
			add(b);
			//����¼�������
			b.addActionListener(action);
			group.add(b);
			b.setSelected(i == 0);
		}
	}
}