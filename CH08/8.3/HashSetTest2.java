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
import java.util.*;
class R
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			if (r.count == this.count)
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}
public class HashSetTest2
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//打印HashSet集合，集合元素没有重复
		System.out.println(hs);
		//取出第一个元素
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//为第一个元素的count实例变量赋值
		first.count = -3;		//1
		//再次输出HashSet集合，集合元素有重复元素
		System.out.println(hs);
		//删除count为-3d的R对象
		hs.remove(new R(-3));		//2
		//可以看到被删除了一个R元素
		System.out.println(hs);
		//输出false
		System.out.println("hs是否包含count为-3的R对象？" + hs.contains(new R(-3)));
		//输出false
		System.out.println("hs是否包含count为5的R对象？" + hs.contains(new R(5)));
	}
}