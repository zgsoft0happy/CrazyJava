/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
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
			"���Java����",
			"������Java EE��ҵӦ��ʵս"
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
			lit.add("------�ָ���------");
		}
		System.out.println("======���濪ʼ�������======");
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}