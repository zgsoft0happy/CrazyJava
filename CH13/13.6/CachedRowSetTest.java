/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-02  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.sql.*;
import java.io.*;
import  javax.sql.rowset.*;
import java.util.*;
public class CachedRowSetTest
{
	private static String driver;
	private static String url;
	private static String user;
	private static String pass;
	public void initParam(String paramFile) throws Exception
	{
		//使用Properties类来加载属性文件
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public CachedRowSet query(String sql) throws Exception
	{
		//加载驱动
		Class.forName(driver);
		//获取数据库连接
		Connection conn = DriverManager.getConnection(url , user , pass);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		//使用RowSetProvider创建RowSetFactory
		RowSetFactory factory = RowSetProvider.newFactory();
		//创建默认的CachedRowSet实例
		CachedRowSet cachedRs = factory.createCachedRowSet();
		//使用ResultSet装填RowSet
		cachedRs.populate(rs);		//1
		//关闭资源
		rs.close();
		stmt.close();
		conn.close();
		return cachedRs;
	}
	public static void main(String[] args) throws Exception
	{
		CachedRowSetTest ct = new CachedRowSetTest();
		ct.initParam("mysql.ini");
		CachedRowSet rs = ct.query("select * from student_table");
		rs.afterLast();
		//向前滚动结果集
		while (rs.previous())
		{
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			if (rs.getInt("student_id") == 3)
			{
				//修改指定记录行
				rs.updateString("student_name" , "孙悟空");
				rs.updateRow();
			}
		}
		//重新获取数据库连接
		Connection conn = DriverManager.getConnection(url , user , pass);
		conn.setAutoCommit(false);
		//把对RowSet所做的修改同步到底层数据库
		rs.acceptChanges(conn);
	}
}