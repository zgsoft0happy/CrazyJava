/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class PropertiesTest
{
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		//向Properties中添加属性
		props.setProperty("username" , "yeeku");
		props.setProperty("password" , "123456");
		//将Properties中的key-value对保存在a.ini文件中
		props.store(new FileOutputStream("a.ini") , "comment line");	//1
		//新建一个Properties对象
		Properties props2 = new Properties();
		//向Properrties中添加属性
		props2.setProperty("gender" , "male");
		//将a.ini文件中的key-value对追加到props2中
		props2.load(new FileInputStream("a.ini"));	//2
		System.out.println(props2);
	}
}