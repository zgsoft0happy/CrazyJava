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
import java.util.Comparator;
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
}
public class TreeSetTest4
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(new Comparator()
		{
			//根据M对象的age属性来决定大小
			public int compare(Object o1 , Object o2)
			{
				M m1 = (M)o1;
				M m2 = (M)o2;
				return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
			}
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
}