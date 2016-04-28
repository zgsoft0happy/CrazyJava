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
public class CallableStatementTest
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
	public void callProcedure() throws Exception
	{
		//��������
		Class.forName(driver);
		try(
			//��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��CallableStatement����
			CallableStatement cstmt = conn.prepareCall("{call add_pro(? , ? ,?)}"))
		{
			cstmt.setInt(1 , 4);
			cstmt.setInt(2 , 5);
			//ע��CallableStatement�ĵ���������ʱint����
			cstmt.registerOutParameter(3 , Types.INTEGER);
			//ִ�д洢����
			cstmt.execute();
			//��ȡ������洢���̴���������ֵ
			System.out.println("ִ�н���ǣ�" + cstmt.getInt(3));
		}
	}
	public static void main(String[] args) throws Exception
	{
		CallableStatementTest ct = new CallableStatementTest();
		ct.initParam("mysql.ini");
		ct.callProcedure();
	}
}