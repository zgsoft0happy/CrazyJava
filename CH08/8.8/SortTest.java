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
import java.util.ArrayList;
import java.util.Collections;
public class SortTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		//输出：[2, -5, 3, 0]
		System.out.println(nums);
		//将List集合元素的次序反转
		Collections.reverse(nums);
		//输出：[0, 3, -5, 2]
		System.out.println(nums);
		//将List集合元素按自然顺序排序
		Collections.sort(nums);
		//输出：[-5, 0, 2, 3]
		System.out.println(nums);
		//将List集合元素按随机顺序排序
		Collections.shuffle(nums);
		//每次输出的次序不固定
		System.out.println(nums);
	}
}