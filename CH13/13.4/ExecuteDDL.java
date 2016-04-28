/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-27
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.sql.*;
import java.io.*;
import java.util.*;
public class ExecuteDDL
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile) throws Exception
	{
		//ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void createTable(String sql) throws Exception
	{
		//��������
		Class.forName(driver);
		try(
		//��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url , user , pass);
		//ʹ��Connection������һ��Statement����
		Statement stmt = conn.createStatement())
		{
			//ִ��DDL��䣬�������ݱ�
			stmt.executeUpdate(sql);
		}
	}
	public static void main(String[] args) throws Exception
	{
		ExecuteDDL ed = new ExecuteDDL();
		ed.initParam("mysql.ini");
		ed.createTable("create table jdbc_test (jdbc_id int auto_increment primary key , "
			+ " jdbc_name varchar(255) , jdbc_desc text);");
		System.out.println("----�����ɹ�----");
	}
}