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
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class ListTest2
{
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));
		System.out.println(books);
		//删除集合中的A对象，将导致带一个元素被删除
		books.remove(new A());		//1
		System.out.println(books);
		//删除集合中的A对象，再次删除集合中的第一个元素
		books.remove(new A());		//2
		System.out.println(books);
	}
}