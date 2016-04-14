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
import java.util.IdentityHashMap;
public class IdentityHashMapTest
{
	public static void main(String[] args)
	{
		IdentityHashMap ihm = new IdentityHashMap();
		//下面两行代码将会向IdentityHashMap对象中添加两个key-value对
		ihm.put(new String("语文") , 89);
		ihm.put(new String("语文") , 78);
		//下面两行代码只会向IdentityHashMap对象中添加啊一个key-value对
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}