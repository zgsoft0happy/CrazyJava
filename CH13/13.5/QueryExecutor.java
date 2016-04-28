/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-28   Locate:124
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class QueryExecutor
{
	JFrame jf = new JFrame("查询执行器");
	private JScrollPane scrollPane;
	private JButton execBn = new JButton("查询");
	//用于输入查询语句的文本框
	private JTextField sqlField = new JTextField(45);
	private static Connection conn;
	private static Statement stmt;
	//采用静态初始化块来初始化Connection、Statement对象
	static 
	{
		try
		{
			Properties props = new Properties();
			props.load(new FileInputStream("mysql.ini"));
			String drivers = props.getProperty("driver");
			String url = props.getProperty("url");
			String username = props.getProperty("user");
			String password = props.getProperty("pass");
			//加载数据库驱动
			Class.forName(drivers);
			//取得数据库链接
			conn = DriverManager.getConnection(url , username , password);
			stmt = conn.createStatement();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//----初始化界面的方法------
	public void init()
	{
		JPanel top = new JPanel();
		top.add(new JLabel("输入查询语句："));
		top.add(sqlField);
		top.add(execBn);
		//为执行按钮、单行文本框添加事件监听器
		execBn.addActionListener(new ExceListener());
		sqlField.addActionListener(new ExceListener());
		jf.add(top , BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	//定义监听器
	class ExceListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			//删除原来的Jtable(Jtable使用scrollPane来包装)
			if (scrollPane != null)
			{
				jf.remove(scrollPane);
			}
			try(
				//根据用户输入的SQL语句执行查询
				ResultSet rs = stmt.executeQuery(sqlField.getText()))
			{
				//取出ResultSet的MetaData
				ResultSetMetaData rsmd = rs.getMetaData();
				Vector<String> columnNames = new Vector<>();
				Vector<Vector<String>> data = new Vector<>();
				//把ResultSet的所有列名添加到Vector里
				for (int i = 0 ; i < rsmd.getColumnCount(); i++)
				{
					columnNames.add(rsmd.getColumnName(i+1));
				}
				//把ResultSet的所有记录添加到Vector里
				while (rs.next())
				{
					Vector<String> v = new Vector<>();
					for (int i = 0 ; i <rsmd.getColumnCount() ; i++)
					{
						v.add(rs.getString(i + 1));
					}
					data.add(v);
				}
				//创建新的Jtable
				JTable table = new JTable(data , columnNames);
				scrollPane = new JScrollPane(table);
				//添加新的Table
				jf.add(scrollPane);
				//更新主窗口
				jf.validate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		new QueryExecutor().init();
	}
}