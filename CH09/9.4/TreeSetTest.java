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
import java.util.*;
public class TreeSetTest
{
	public static void main(String[] args)
	{
		//Comparator��ʵ��������TreeSet��ʵ�����͵ĸ��࣬����Ҫ��
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