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
import java.util.Set;
import java.util.HashSet;
public class SetTest
{
	public static void main(String[]  args)
	{
		Set books = new HashSet();
		//添加一个字符串对象
		books.add(new String("疯狂Java讲义"));
		//再次添加一个字符串对象
		//因为两个字符串对象通过equals方法比较相等
		//所以添加失败，返回false
		boolean result = books.add(new String("疯狂Java讲义"));
		//从下面输出看到集合只有一个元素
		System.out.println(result + "-->" + books);
	}
}