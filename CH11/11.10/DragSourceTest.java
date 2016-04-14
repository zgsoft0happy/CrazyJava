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
import javax.swing.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
public class DragSourceTest
{
	JFrame jf = new JFrame("Swing���Ϸ�֧��");
	JLabel srcLabel = new JLabel("AWT���Ϸ�֧�֡�\n + �����ı��������������������\n");
	public void init()
	{
		DragSource dragSource = DragSource.getDefaultDragSource();
		//��srcLabelת�����Ϸ�Դ�����ܽ��ܸ�ֵ���ƶ����ֲ���
		dragSource.createDefaultDragGestureRecognizer(srcLabel 
			, DnDConstants.ACTION_COPY_OR_MOVE , new DragGestureListener()
		{
			public void dragGestureRecognized(DragGestureEvent event)
			{
				//��JLabel����ı���Ϣ��װ��Transferable����
				String txt = srcLabel.getText();
				Transferable transferable = new StringSelection(txt);
				//�����ϷŲ������ϷŹ�����ʹ����״���
				event.startDrag(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) , transferable);
			}
		});
		jf.add(new JScrollPane(srcLabel));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DragSourceTest().init();
	}
}