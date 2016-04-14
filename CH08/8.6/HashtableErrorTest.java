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
import java.util.Hashtable;
import java.util.Iterator;
public class HashtableErrorTest
{
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		//此处的A类与前一个程序的A类是同一个类
		ht.put(new A(60000) , "疯狂Java讲义");
		ht.put(new A(87563) , "轻量级Java EE企业应用实战");
		//获得Hashtable的key Set集合对应的Iterator迭代器
		Iterator it = ht.keySet().iterator();
		//取出Map中第一个key
		A first = (A)it.next();
		first.count = 87563;	//1
		//输出{A@1560b=疯狂Java讲义，A@1560b=轻量级java EE企业应用实战}
		System.out.println(ht);
		//只能删除没有被修改过的key所对应的key-value对
		ht.remove(new A(87563));
		System.out.println(ht);
		//无法获取剩下的value，下面两行代码都将输出null
		System.out.println(ht.get(new A(87563)));		//2
		System.out.println(ht.get(new A(60000)));		//3
	}
}