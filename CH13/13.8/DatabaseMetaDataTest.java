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
public class DatabaseMetaDataTest
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
	public void info() throws Exception
	{
		//��������
		Class.forName(driver);
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass))
		{
			//��ȡDatabaseMetaData����
			DatabaseMetaData dbmd = conn.getMetaData();
			//��ȡMySQL֧�ֵ����б�����
			ResultSet rs = dbmd.getTableTypes();
			System.out.println("--MySQL֧�ֵı�������Ϣ--");
			printResultSet(rs);
			//��ȡ��ǰ���ݿ��ȫ�����ݱ�
			rs = dbmd.getTables(null , null , "%" , new String[]{"TABLE"});
			System.out.println("--��ǰ���ݿ�������ݱ���Ϣ--");
			printResultSet(rs);
			//��ȡ��ǰ���ݿ��ȫ���洢����
			rs = dbmd.getProcedures(null , null , "%");
			System.out.println("--��ǰ���ݿ���Ĵ洢������Ϣ--");
			printResultSet(rs);
			//��ȡteacher_table���student_table��֮������Լ��
			rs = dbmd.getCrossReference(null , null , "teacher_table" , null , null , "student_table");
			System.out.println("--teacher_table���student_table��֮������Լ��--");
			printResultSet(rs);
			//��ȡstudent_table���ȫ��������
			rs = dbmd.getColumns(null , null , "student_table" , "%");
			System.out.println("--student_table���ȫ��������--");
			printResultSet(rs);
		}
	}
	public void printResultSet(ResultSet rs) throws SQLException
	{
		ResultSetMetaData rsmd = rs.getMetaData();
		//��ӡResultSet�������б���
		for (int i = 0 ; i < rsmd.getColumnCount() ; i++)
		{
			System.out.println(rsmd.getColumnName(i + 1) + "\t");
		}
		System.out.println();
		//��ӡResultSet���ȫ������
		while(rs.next())
		{
			for(int i = 0 ; i <rsmd.getColumnCount() ; i++)
			{
				System.out.print(rs.getString(i + 1) + "\t");
			}
			System.out.println();
		}
		rs.close();
	}
	public static void main(String[] args) throws Exception
	{
		DatabaseMetaDataTest dt = new DatabaseMetaDataTest();
		dt.initParam("mysql.ini");
		dt.info();
	}
}