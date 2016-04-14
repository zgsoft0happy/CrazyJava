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
import java.util.HashMap;
public class NullInHashMap
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		//试图将两个key为null值得key-value对放入HashMap中
		hm.put(null , null);
		hm.put(null , null);	//1
		//讲一个value为null值得key-value对放入HashMap中
		hm.put("a" , null);		//2
		//输出Map对象
		System.out.println(hm);
	}
}