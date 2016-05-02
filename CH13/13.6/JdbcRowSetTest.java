/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-02  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.sql.*;
import java.io.*;
import  javax.sql.rowset.*;
import java.util.*;
public class JdbcRowSetTest
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
	public void update(String sql) throws Exception
	{
		//��������
		Class.forName(driver);
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass);
			//����JdbcRowSetImpl����
			JdbcRowSet jdbcRs = new JdbcRowSetImpl(conn))		//1
		{
			//����SQL��ѯ���
			jdbcRs.setCommand(sql);
			//ִ�в�ѯ
			jdbcRs.execute();
			jdbcRs.afterLast();
			//��ǰ���������
			while (jdbcRs.previous())
			{
				System.out.println(jdbcRs.getString(1) + "\t" + jdbcRs.getString(2) + "\t" + jdbcRs.getString(3));
				if (jdbcRs.getInt("student_id") == 3)
				{
					//�޸��ƶ���¼��
					jdbcRs.updateString("student_name" , "�����");
					jdbcRs.updateRow();
				}
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		JdbcRowSetTest jt = new JdbcRowSetTest();
		jt.initParam("mysql.ini");
		jt.update("select * from student_table");
	}
}