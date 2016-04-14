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
import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;
public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		//获取系统所有的环境变量
		Map<String , String> env = System.getenv();
		for (String name : env.keySet())
		{
			System.out.println(name + " ---> " + env.get(name));
		}
		//获取指定环境变量的值
		System.out.println(System.getenv("JAVA_HOME"));
		//获取所有的系统属性
		Properties props = System.getProperties();
		//将所有的系统属性保存在props.txt文件中
		props.store(new FileOutputStream("props.txt") , "System Properties");
		//输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
	}
}