/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-28   Locate:124
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
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
		//ʹ��Properties����������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void executeSQL(String sql) throws Exception
	{
		//��������
		Class.forName(driver);
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��Statement����
			Statement stmt = conn.createStatement())
		{
			//ִ��SQL��䣬����booleanֵ��ʾ�Ƿ����ResultSet
			boolean hasResultSet = stmt.execute(sql);
			//���ִ�к���ResultSet�����
			if (hasResultSet)
			{
				try(
					//��ȡ�����
					ResultSet rs = stmt.getResultSet())
				{
					//ResultSetMetaData�����ڷ����������Ԫ���ݽӿ�
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					//�������ResultSet����
					while (rs.next())
					{
						//һ�����ÿһ�е�ֵ
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
				System.out.println("��SQL���Ӱ��ļ�¼��" + stmt.getUpdateCount() + "��");
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		ExecuteSQL es = new ExecuteSQL();
		es.initParam("mysql.ini");
		System.out.println("-----ִ��ɾ�����DDL���---");
		es.executeSQL("drop table if exists my_test");
		System.out.println("ִ�н����DDL���");
		es.executeSQL("create table my_test" 
			+ "(test_id int auto_increment primary key , "
			+ "test_name varchar(255))");
		System.out.println("---ִ�в������ݵ�DML���---");
		es.executeSQL("insert into my_test(test_name)"
			+ " select student_name from student_table");
		System.out.println("---ִ�в�ѯ���ݵĲ�ѯ���----");
		es.executeSQL("select * from my_test");
	}
}