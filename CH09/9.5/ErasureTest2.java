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
/*
public class ErasureTest2
{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li ;
		//下面代码引起”未经检查的转换“警告，编译、运行时完全正常
		List<String> ls = list;	//1
		//只要访问ls里的元素，如下代码将引发运行时异常
		System.out.println(ls.get(0));
	}
}
*/
public class ErasureTest2
{
	public static void main(String[] args)
	{
		List li = new ArrayList();
		li.add(6);
		li.add(9);
		System.out.println((String)li.get(0));
	}
}