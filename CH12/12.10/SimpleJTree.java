/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-01
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.*;
import javax.swing.tree.*;
public class SimpleJTree
{
	JFrame jf = new JFrame("简单树");
	JTree tree;
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode guangdong;
	DefaultMutableTreeNode guangxi;
	DefaultMutableTreeNode foshan;
	DefaultMutableTreeNode shantou;
	DefaultMutableTreeNode guilin;
	DefaultMutableTreeNode nanning;
	public void init()
	{
		//依次创建树中的素有节点
		root = new DefaultMutableTreeNode("中国");
		guangdong = new DefaultMutableTreeNode("广东");
		guangxi = new DefaultMutableTreeNode("广西");
		foshan = new DefaultMutableTreeNode("佛山");
		shantou = new DefaultMutableTreeNode("汕头");
		guilin = new DefaultMutableTreeNode("桂林");
		nanning = new DefaultMutableTreeNode("南宁");
		//通过add()方法建立树节点之间的父子关系
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		//以根节点创建树
		tree = new JTree(root);		//1
		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleJTree().init();
	}
}