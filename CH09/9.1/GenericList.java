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
import java.util.List;
import java.util.ArrayList;
public class GenericList
{
	public static void main(String[] args)
	{
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();		//1
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.add("轻量级Java EE企业应用实战");
		//下面代码将引起编译错误
		strList.add(5);		//2
		for (int i = 0 ; i < strList.size() ; i++)
		{
			//下面代码无须进行强制类型转换
			String str = strList.get(i);		//3
		}
	}
}