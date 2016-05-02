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
public class RowSetFactoryTest
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
	public void update(String sql) throws Exception
	{
		//加载驱动
		Class.forName(driver);
		//使用RowSetPropvider创建RowSetFactory
		RowSetFactory factory = RowSetProvider.newFactory();
		try(
			//创建默认的JdbcRowSet实例
			JdbcRowSet jdbcRs = factory.createJdbcRowSet())
		{
			//设置必要的连接信息
			jdbcRs.setUrl(url);
			jdbcRs.setUsername(user);
			jdbcRs.setPassword(pass);
			//设置SQL查询语句
			jdbcRs.setCommand(sql);
			//执行查询
			jdbcRs.execute();
			jdbcRs.afterLast();
			//向前滚动结果集
			while (jdbcRs.previous())
			{
				System.out.println(jdbcRs.getString(1) + "\t" + jdbcRs.getString(2) + "\t" + jdbcRs.getString(3));
				if (jdbcRs.getInt("student_id") == 3)
				{
					//修改制定记录行
					jdbcRs.updateString("student_name" , "孙悟空");
					jdbcRs.updateRow();
				}
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		RowSetFactoryTest jt = new RowSetFactoryTest();
		jt.initParam("mysql.ini");
		jt.update("select * from student_table");
	}
}