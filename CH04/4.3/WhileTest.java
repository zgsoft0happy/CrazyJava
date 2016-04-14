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
public class WhileTest
{
	public static void main(String[] args)
	{
		//循环的初始化条件
		int count = 0;
		//当count小于10时，执行循环体
		while (count < 10)
		{
			System.out.println(count);
			//迭代语句
			count++;
		}
		System.out.println("循环结束");
		
		count = 0;
		while (count < 10)
		{
			System.out.println("不停执行的死循环 " + count);
			count--;
		}
		System.out.println("永远无法跳出的循环体");
		
		
	}
}