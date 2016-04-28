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
public class ExecuteDML
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
	public int insertData(String sql) throws Exception
	{
		//加载驱动
		Class.forName(driver);
		try(
			//获取数据库连接
			Connection conn = DriverManager.getConnection(url , user , pass);
			//使用Connection来创建一个Statement对象
			Statement stmt = conn.createStatement())
		{
			//执行DML语句，返回受影响的记录行数
			return stmt.executeUpdate(sql);
		}
	}
	public static void main(String[] args) throws Exception
	{
		ExecuteDML ed = new ExecuteDML();
		ed.initParam("mysql.ini");
		int result = ed.insertData("insert into jdbc_test(jdbc_name , jdbc_desc) "
			+ " select s.student_name , t.teacher_name "
			+ " from student_table s , teacher_table t "
			+ "where s.java_teacher = t.teacher_id;");
		System.out.println("--系统中共有" + result + "条记录受影响--");
	}
}