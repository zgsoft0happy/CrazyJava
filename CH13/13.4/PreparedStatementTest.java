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
public class PreparedStatementTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	private void initParam(String paramFile) throws Exception
	{
		//使用Properties类记载属性文件
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
		//加载驱动
		Class.forName(driver);
	}
	public void insertUseStatement() throws Exception
	{
		long start = System.currentTimeMillis();
		try(
			//获取数据库连接
			Connection conn = DriverManager.getConnection(url , user , pass);
			//使用Connection来创建一个PreparedStatement对象
			Statement stmt = conn.createStatement())
		{
			//100次为PreparedStatement的参数设值，就可以插入100条记录
			for (int i = 0 ; i < 100 ; i++)
			{
				stmt.executeUpdate("insert into student_table values("
				+ " null , '姓名" + i + "' , 1)");
			}
			System.out.println("使用Statement费时：" + (System.currentTimeMillis() - start));
		}
	}
	public void insertUsePrepare() throws Exception
	{
		long start = System.currentTimeMillis();
		try(
			//获取数据库连接
			Connection conn = DriverManager.getConnection(url , user , pass);
			//使用Connection来创建一个PreparedStatement对象
			PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null , ? , 1)"))
		{
			//100次为PreparedStatement的参数设值，就可以插入100条记录
			for (int i = 0 ; i < 100 ; i++)
			{
				pstmt.setString(1 , "姓名" + i);
				pstmt.executeUpdate();
			}
			System.out.println("使用PreparedStatement费时：" + (System.currentTimeMillis() - start));
		}
	}
	public static void main(String[] args) throws Exception
	{
		PreparedStatementTest pt = new PreparedStatementTest();
		pt.initParam("mysql.ini");
		pt.insertUseStatement();
		pt.insertUsePrepare();
	}
}