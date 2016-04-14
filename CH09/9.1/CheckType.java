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
import java.util.*;
//自定义一个StrList集合类，使用组合的方式来复用ArrayList类
class StrList
{
	private List strList = new ArrayList();
	//定义StrList的add方法
	public boolean add(String ele)
	{
		return strList.add(ele);
	}
	//重写get()方法，将get()方法的返回值类型改为String类型
	public String get(int index)
	{
		return (String)strList.get(index);
	}
	public int size()
	{
		return strList.size();
	}
}
public class CheckType
{
	public static void main(String[] args)
	{
		//创建一个只想保存字符串的List集合
		StrList strList = new StrList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.add("轻量级Java EE企业应用实战");
		//下面一句不能把Integer对象“丢进”集合中，否则将引起编译错误
		strList.add(5);		//1
		System.out.println(strList);
		for (int i = 0 ; i < strList.size() ; i++)
		{
			//因为StrList里元素的类型就是String类型
			//所以无须进行强制类型转换
			String str = strList.get(i);
		}
	}
}