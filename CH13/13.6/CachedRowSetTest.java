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
public class CachedRowSetTest
{
	private static String driver;
	private static String url;
	private static String user;
	private static String pass;
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
	public CachedRowSet query(String sql) throws Exception
	{
		//��������
		Class.forName(driver);
		//��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url , user , pass);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		//ʹ��RowSetProvider����RowSetFactory
		RowSetFactory factory = RowSetProvider.newFactory();
		//����Ĭ�ϵ�CachedRowSetʵ��
		CachedRowSet cachedRs = factory.createCachedRowSet();
		//ʹ��ResultSetװ��RowSet
		cachedRs.populate(rs);		//1
		//�ر���Դ
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
		//��ǰ���������
		while (rs.previous())
		{
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			if (rs.getInt("student_id") == 3)
			{
				//�޸�ָ����¼��
				rs.updateString("student_name" , "�����");
				rs.updateRow();
			}
		}
		//���»�ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url , user , pass);
		conn.setAutoCommit(false);
		//�Ѷ�RowSet�������޸�ͬ�����ײ����ݿ�
		rs.acceptChanges(conn);
	}
}