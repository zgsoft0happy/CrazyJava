/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.*;
import java.nio.charset.*;
public class CharsetTest
{
	public static void main(String[] args)
	{
		//获取java支持的全部字符集
		SortedMap<String , Charset> map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			//输出字符集的别名和对应的Charset对象
			System.out.println(alias + "--->" + map.get(alias));
		}
	}
}