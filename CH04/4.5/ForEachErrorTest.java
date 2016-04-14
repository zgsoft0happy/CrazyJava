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
public class ForEachErrorTest
{
	public static void main(String[] args)
	{
		String[] books = {"轻量级Java EE企业应用实战","疯狂Java讲义","疯狂Android讲义"};
		//使用foreach循环来遍历数组元素
		//其中book将会自动迭代每个数组元素
		for(String book : books)
		{
			book = "疯狂Ajax讲义";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}