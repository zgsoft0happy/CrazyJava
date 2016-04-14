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
public class IteratorTest
{
	public static void main(String[] args)
	{
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext())
		{
			//it.nexxt()方法返回的数据类型是Object类型
			//需要强制类型转换
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("疯狂Java讲义"))
			{
				//从集合中删除上一次next方法返回的元素
				it.remove();
			}
			//book变量赋值，不会改变集合元素本事
			book = "测试字符串";		//1
		}
		System.out.println(books);
	}
}