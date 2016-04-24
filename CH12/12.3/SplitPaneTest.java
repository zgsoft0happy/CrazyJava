/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class SplitPaneTest
{
	Book[] books = new Book[]{
		new Book("疯狂Java讲义" , new ImageIcon("ico/java.png") , "国内关于Java编程最全面的图书\n看得懂，学得会"),
		new Book("轻量级Java EE企业应用实战" , new ImageIcon("ico/ee.png") , "SSH整合开发的经典图书，值得拥有"),
		new Book("疯狂Android讲义" , new ImageIcon("ico/android.png") , "全面介绍Android平台应用程序\n开发的各方面知识")
	};
	JFrame jf = new JFrame("测试JSplitPane");
	JList<Book> bookList = new JList<>(books);
	JLabel bookCover = new JLabel();
	JTextArea bookDesc = new JTextArea();
	public void init()
	{
		//为三个组件设置最佳大小
		bookList.setPreferredSize(new Dimension(150 , 300));
		bookCover.setPreferredSize(new Dimension(300 , 150));
		bookDesc.setPreferredSize(new Dimension(300 , 150));
		//为下拉列表添加事件监听器
		bookList.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent event)
			{
				Book book = (Book)bookList.getSelectedValue();
				bookCover.setIcon(book.getIco());
				bookDesc.setText(book.getDesc());
			}
		});
		//创建一个垂直的分割面板，将bookCover放在上面，将bookDesc放在下面，支持连续布局
		JSplitPane left = new JSplitPane(JSplitPane.VERTICAL_SPLIT , true , bookCover , new JScrollPane(bookDesc));
		//打开“一触即展”特性
		left.setOneTouchExpandable(true);
		//下面代码设置分隔条的大小
		//left.setDividerSize(50);
		//设置该分割面板根据所包含组件的最佳大小来调整布局
		left.resetToPreferredSizes();
		//创建一个水平的分割面板
		//将left组件放在左边，将bookList组件放在右边
		JSplitPane content = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT , left , bookList);
		jf.add(content);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SplitPaneTest().init();
	}
}