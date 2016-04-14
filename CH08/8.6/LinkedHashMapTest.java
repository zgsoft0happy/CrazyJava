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
import java.util.LinkedHashMap;
public class LinkedHashMapTest
{
	public static void main(String[] args)
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("语文" , 80);
		scores.put("英文" , 82);
		scores.put("数学" , 76);
		//遍历scores里的所有key-value对
		for (Object key : scores.keySet())
		{
			System.out.println(key + "--->" +scores.get(key));
		}
	}
}