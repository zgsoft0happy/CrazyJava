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
public class CallableStatementTest
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
	public void callProcedure() throws Exception
	{
		//记载驱动
		Class.forName(driver);
		try(
			//获取数据库连接
			Connection conn = DriverManager.getConnection(url , user , pass);
			//使用Connection来创建一个CallableStatement对象
			CallableStatement cstmt = conn.prepareCall("{call add_pro(? , ? ,?)}"))
		{
			cstmt.setInt(1 , 4);
			cstmt.setInt(2 , 5);
			//注册CallableStatement的第三个参数时int类型
			cstmt.registerOutParameter(3 , Types.INTEGER);
			//执行存储过程
			cstmt.execute();
			//获取病输出存储过程传出参数的值
			System.out.println("执行结果是：" + cstmt.getInt(3));
		}
	}
	public static void main(String[] args) throws Exception
	{
		CallableStatementTest ct = new CallableStatementTest();
		ct.initParam("mysql.ini");
		ct.callProcedure();
	}
}