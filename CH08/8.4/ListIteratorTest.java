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
import java.util.ListIterator;
import java.util.ArrayList;
public class ListIteratorTest
{
	public static void main(String[] args)
	{
		String[] books = {
			"疯狂Java讲义",
			"轻量级Java EE企业应用实战"
		};
		List bookList = new ArrayList();
		for (int i = 0 ; i < books.length ; i++)
		{
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("------分隔符------");
		}
		System.out.println("======下面开始反向迭代======");
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}