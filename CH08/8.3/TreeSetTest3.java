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
class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count +"]";
	}
	//重写equals()方法，根据count来判断是否相等
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
	//重写compareTo()方法，根据count来比较大小
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}
public class TreeSetTest3
{
	public static void main(String[]  args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		//打印TreeSet集合，集合元素是有序排列的
		System.out.println(ts);		//1
		//取出第一个元素
		R first = (R)ts.first();
		//对第一个元素的count赋值
		first.count = 20;
		//取出最后一个元素
		R last = (R)ts.last();
		//对最后一个元素的count赋值，与第二个元素的count相同
		last.count = -2;
		//再次输出将看到TreeSet里的元素处于无序状态，且有重复元素
		System.out.println(ts);		//2
		//删除Field被改变的元素，删除失败
		System.out.println(ts.remove(new R(-2)));		//3
		System.out.println(ts);
		//删除Field没有改变的元素，删除成功
		System.out.println(ts.remove(new R(5)));	//4
		System.out.println(ts);
	}
}