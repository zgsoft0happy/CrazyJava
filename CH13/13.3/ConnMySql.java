/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-26   Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.sql.*;
public class ConnMySql
{
	public static void main(String[] args) throws Exception
	{
		//1.����������ʹ�÷���֪ʶ�����ڼ�ס��ôд
		Class.forName("com.mysql.jdbc.Driver");
		try(
			//2.ʹ��DriverManager��ȡ���ݿ�����
			//���з��ص�Connection�ʹ�����Java��������ݿ������
			//��ͬ���ݿ��URLд����Ҫ�������ĵ����û�����������DBA����
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/select_test" , "root" , "root");
			//3.ʹ��Connection������һ��Statement����
			Statement stmt = conn.createStatement();
			//4.ִ��SQL���
			/*
			Statement������ִ��SQL���ķ�����
			1.execute()��ִ���κ�SQL���--����һ��booleanֵ
				���ִ�к��һ�������ResultSet���򷵻�true�����򷵻�false
			2.executeQuery()ִ��select��� -- ���ز�ѯ���Ľ����
			3.executeUpdate()����ִ��DML��� -- ����һ������
				����SQL���Ӱ��ļ�¼����
			*/
			ResultSet rs = stmt.executeQuery("select s.* , teacher_name from student_table s , teacher_table t"
				+ " where t.teacher_id = s.java_teacher"))
		{
			//ResultSet��һϵ�е�getXxx(������|����)���������ڻ�ȡ��¼ָ��
			//ָ���С��ض��е�ֵ�����ϵ�ʹ��next()����¼ָ������һ��
			//����ƶ�֮���¼ָ����Ȼָ����Ч�У���next()��������true
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t"
					+ rs.getString(2) + "\t"
					+ rs.getString(3) + "\t"
					+ rs.getString(4));
			}
		}
	}
}