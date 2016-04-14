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
import java.util.HashSet;
//类A的equals()方法总是返回true，但没有重写其hashCode()方法
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
//类B的hashCode()方法总是返回1，但没有重写其equals()方法
class B
{
	public int hashCode()
	{
		return 1;
	}
}
//类C的hashCode()方法总是返回2，且重写了其equals()方法
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest
{
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		//分别向books集合中添加两个A对象、两个B对象、两个C对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}