/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.*;
public class ErrorUtils
{
	public static void faultyMethod(List<String>... listStrArray)
	{
		//Java语言不允许创建泛型数组，因此listArray只能被当成List[]处理
		//此时相当于把List<String>赋给了List，已经发生了"堆污染"
		List[] listArray = listStrArray;
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//把listArray的第一个元素赋为myArray
		listArray[0] = myList;
		String s = listStrArray[0].get(0);
	}
}