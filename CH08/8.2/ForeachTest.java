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
import java.util.Collection;
import java.util.HashSet;
public class ForeachTest
{
	public static void main(String[] args)
	{
		//创建一个集合
		Collection books = new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));
		for (Object obj : books)
		{
			//此处的book变量也不是集合元素本身
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("疯狂Android讲义"))
			{
				//下面代码会引发ConcurrentModificationException异常
				books.remove(book);		//1
			}
		}
		System.out.println(books);
	}
}