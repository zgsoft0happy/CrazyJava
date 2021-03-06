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
import java.util.LinkedList;
public class LinkedListTest
{
	public static void main(String[] args)
	{
		LinkedList books = new LinkedList();
		//将字符串元素加入队列的尾部
		books.offer("疯狂Java讲义");
		//讲一个字符串元素加入栈的顶部
		books.push("轻量级Java EE企业应用实战");
		//将字符串元素添加到队列的头部(相当于栈的顶部)
		books.offerFirst("疯狂Android讲义");
		for (int i = 0 ; i <books.size() ; i++)
		{
			System.out.println(books.get(i));
		}
		//访问但不删除栈顶的元素
		System.out.println(books.peekFirst());
		//访问但不删除队列的最后一个元素
		System.out.println(books.peekLast());
		//将栈顶的元素弹出“栈”
		System.out.println(books.pop());
		//下面输出将看到队列中第一个元素被删除
		System.out.println(books);
		//访问并删除队列的最后一个元素
		System.out.println(books.pollLast());
		//下面输出将看到队列中只剩下中间一个元素：
		//轻量级Java EE企业应用实战
		System.out.println(books);
	}
}