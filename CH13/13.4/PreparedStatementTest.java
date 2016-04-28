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
public class PreparedStatementTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	private void initParam(String paramFile) throws Exception
	{
		//ʹ��Properties����������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
		//��������
		Class.forName(driver);
	}
	public void insertUseStatement() throws Exception
	{
		long start = System.currentTimeMillis();
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��PreparedStatement����
			Statement stmt = conn.createStatement())
		{
			//100��ΪPreparedStatement�Ĳ�����ֵ���Ϳ��Բ���100����¼
			for (int i = 0 ; i < 100 ; i++)
			{
				stmt.executeUpdate("insert into student_table values("
				+ " null , '����" + i + "' , 1)");
			}
			System.out.println("ʹ��Statement��ʱ��" + (System.currentTimeMillis() - start));
		}
	}
	public void insertUsePrepare() throws Exception
	{
		long start = System.currentTimeMillis();
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��PreparedStatement����
			PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null , ? , 1)"))
		{
			//100��ΪPreparedStatement�Ĳ�����ֵ���Ϳ��Բ���100����¼
			for (int i = 0 ; i < 100 ; i++)
			{
				pstmt.setString(1 , "����" + i);
				pstmt.executeUpdate();
			}
			System.out.println("ʹ��PreparedStatement��ʱ��" + (System.currentTimeMillis() - start));
		}
	}
	public static void main(String[] args) throws Exception
	{
		PreparedStatementTest pt = new PreparedStatementTest();
		pt.initParam("mysql.ini");
		pt.insertUseStatement();
		pt.insertUsePrepare();
	}
}