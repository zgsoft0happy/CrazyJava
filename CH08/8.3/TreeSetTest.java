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
public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		//向TreeSet中添加四个Integer对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		//输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		//输出集合中的第一个元素
		System.out.println(nums.first());
		//输出集合里的最后一个元素
		System.out.println(nums.last());
		//返回小于4的子集，不包含4
		System.out.println(nums.headSet(4));
		//返回大于5的子集，如果Set中包含5，子集中也包含5
		System.out.println(nums.tailSet(5));
		//返回大于等于-3、小于4的子集
		System.out.println(nums.subSet(-3 , 4));
	}
}