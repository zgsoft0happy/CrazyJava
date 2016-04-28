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
public class LoginFrame
{
	private final String PROP_FILE = "mysql.ini";
	private String driver;
	//url是数据库的服务地址
	private String url;
	private String user;
	private String pass;
	//登录界面的GUI组建
	private JFrame jf = new JFrame("登录");
	private JTextField userField = new JTextField(20);
	private JTextField passField = new JTextField(20);
	private JButton loginButton = new JButton("登录");
	public void init() throws Exception
	{
		Properties connProp = new Properties();
		connProp.load(new FileInputStream(PROP_FILE));
		driver = connProp.getProperty("driver");
		url = connProp.getProperty("url");
		user = connProp.getProperty("user");
		pass = connProp.getProperty("pass");
		//加载驱动
		Class.forName(driver);
		//为登录按钮添加事件监听器
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//登录成功则显示”登录成功“
				if (validate(userField.getText(), passField.getText()))
				{
					JOptionPane.showMessageDialog(jf , "登录成功");
				}
				//否则显示”登录失败“
				else
				{
					JOptionPane.showMessageDialog(jf , "登录失败");
				}
			}
		});
		jf.add(userField , BorderLayout.NORTH);
		jf.add(passField);
		jf.add(loginButton , BorderLayout.SOUTH);
		jf.pack();
		jf.setVisible(true);
	}
	/*可能使用SQL注入后生成的SQL语句破解
	private boolean validate(String userName , String userPass)
	{
		//执行查询的SQL语句
		String sql = "select * from jdbc_test "
			+ " where jdbc_name = '" + userName
			+ "' and jdbc_desc = '" + userPass + "'";
		System.out.println(sql);
		try(
			Connection conn = DriverManager.getConnection(url , user , pass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql))
		{
			//如果查询的ResultSet里有超过一条的记录，则登录成功
			if (rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	*/
	//下面验证代码可以防止SQL注入
	private boolean validate(String userName , String userPass)
	{
		
		try(
			Connection conn = DriverManager.getConnection(url , user , pass);
			PreparedStatement pstmt = conn.prepareStatement("select * from jdbc_test where "
				+ " jdbc_name=? and jdbc_desc=?");)
		{
			pstmt.setString(1 , userName);
			pstmt.setString(2 , userPass);
			try(
				ResultSet rs = pstmt.executeQuery())
			{
				//如果查询的ResultSet里有超过一条的记录，则登录成功
				if (rs.next())
				{
					return true;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) throws Exception
	{
		new LoginFrame().init();
	}
}