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
import java.util.TreeSet;
class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	//重写equals()方法，总是返回true
	public boolean equals(Object obj)
	{
		return true;
	}
	//重写了compareTo(Object obj)方法，总是返回正整数
	public int compareTo(Object obj)
	{
		return 1;
	}
}
public class TreeSetTest2
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//输出true，表明添加成功
		System.out.println(set.add(z1));		//1
		//下面输出set集合，将看到有两个元素
		System.out.println(set);
		//修改set集合的第一个元素的age变量
		((Z)(set.first())).age = 9;
		//输出set集合的最后一个元素的age变量，将看到也变成9
		System.out.println(((Z)(set.last())).age);
	}
}