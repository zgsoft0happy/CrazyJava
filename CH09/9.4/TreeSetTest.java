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
public class TreeSetTest
{
	public static void main(String[] args)
	{
		//Comparator的实际类型是TreeSet里实际类型的父类，满足要求
		TreeSet<String> ts1 = new TreeSet<>(
			new Comparator<Object>()
		{
			public int compare(Object fst , Object snd)
			{
				return hashCode() > snd.hashCode() ? 1 
					: hashCode() < snd.hashCode() ? -1 : 0;
			}
		});
		ts1.add("hello");
		ts1.add("wa");
		TreeSet<String> ts2 = new TreeSet<>(
			new Comparator<String>()
		{
			public int compare(String first , String second)
			{
				return first.length() > second.length() ? -1
					: first.length() < second.length() ? 1 : 0;
			}
		});
		ts2.add("hello");
		ts2.add("wa");
		System.out.println(ts1);
		System.out.println(ts2);
	}
}