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
class A
{
	int count;
	public A(int count)
	{
		this.count = count;
	}
	//根据count的值来判断两个对象是否相等
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj != null && obj.getClass() == A.class)
		{
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	//根据count来计算hashCode值
	public int hashCode()
	{
		return this.count;
	}
}
class B
{
	//重写equals()方法，B对象与任何对象通过equals()方法比较都相等
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashtableTest
{
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		ht.put(new A(60000) , "疯狂Java讲义");
		ht.put(new A(87563) , "轻量级Java EE企业应用实战");
		ht.put(new A(1232) , new B());
		System.out.println(ht);
		//只要两个对象通过equals()方法比较返回true
		//Hashtable就认为它们是相等的value
		//由于Hashtable中有一个B对象
		//它与任何对象通过equals()方法比较都相等，所以下面输出true
		System.out.println(ht.containsValue("测试字符串"));	//1
		//只要两个A对象的count相等，它们通过equals()方法比较返回true，且hashCode值相等
		//Hashtable即认为他们是相同的key，所以下面输出true
		System.out.println(ht.containsKey(new A(87563)));	//2
		//下面语句可以删除最后一个key-value对
		ht.remove(new A(1232));		//3
		//通过返回hashtable的所有key组成的Set集合
		//从而遍历Hashtable的每个key-value对
		for (Object key : ht.keySet())
		{
			System.out.print(key + "--->");
			System.out.print(ht.get(key) + "\n");
		}
	}
}