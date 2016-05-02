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
public class TransactionTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
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
	public void insertInTransaction(String[] sqls) throws Exception
	{
		//加载驱动
		Class.forName(driver);
		try(Connection conn = DriverManager.getConnection(url , user , pass))
		{
			//关闭自动提交事务
			conn.setAutoCommit(false);
			try(
				//使用Connection来创建一个Statement对象
				Statement stmt = conn.createStatement())
			{
				//循环多次执行sql语句
				for (String sql : sqls)
				{
					stmt.executeUpdate(sql);
				}
			}
			//提交事务
			conn.commit();
		}
	}
	public static void main(String[] args) throws Exception
	{
		TransactionTest tt = new TransactionTest();
		tt.initParam("mysql.ini");
		String[] sqls = new String[]
		{
			"insert into student_table values(null , 'aaa' , 1)",
			"insert into student_table values(null , 'bbb' , 1)",
			"insert into student_table values(null , 'ccc' , 1)",
			//下面这条SQL语句将会违反外键约束
			//因为teacher_table表中，诶有ID为5的记录
			"insert into student_table values(null , 'ccc' , 5)"	//1
		};
		tt.insertInTransaction(sqls);
	}
}