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
public class ExecuteSQL
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile) throws Exception
	{
		//使用Properties类加载属性文件
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void executeSQL(String sql) throws Exception
	{
		//加载驱动
		Class.forName(driver);
		try(
			//获取数据库连接
			Connection conn = DriverManager.getConnection(url , user , pass);
			//使用Connection来创建一个Statement对象
			Statement stmt = conn.createStatement())
		{
			//执行SQL语句，返回boolean值表示是否包含ResultSet
			boolean hasResultSet = stmt.execute(sql);
			//如果执行后又ResultSet结果集
			if (hasResultSet)
			{
				try(
					//获取结果集
					ResultSet rs = stmt.getResultSet())
				{
					//ResultSetMetaData适用于分析结果集的元数据接口
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					//迭代输出ResultSet对象
					while (rs.next())
					{
						//一次输出每一列的值
						for (int i = 0 ; i < columnCount ; i++)
						{
							System.out.print(rs.getString(i + 1) + "\t");
						}
						System.out.println();
					}
				}
			}
			else
			{
				System.out.println("该SQL语句影响的记录有" + stmt.getUpdateCount() + "条");
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		ExecuteSQL es = new ExecuteSQL();
		es.initParam("mysql.ini");
		System.out.println("-----执行删除表的DDL语句---");
		es.executeSQL("drop table if exists my_test");
		System.out.println("执行建表的DDL语句");
		es.executeSQL("create table my_test" 
			+ "(test_id int auto_increment primary key , "
			+ "test_name varchar(255))");
		System.out.println("---执行插入数据的DML语句---");
		es.executeSQL("insert into my_test(test_name)"
			+ " select student_name from student_table");
		System.out.println("---执行查询数据的查询语句----");
		es.executeSQL("select * from my_test");
	}
}