/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class BitOperatorTest
{
	public static void main(String[] args)
	{
		//将输出1
		System.out.println(5 & 9);
		//将输出13
		System.out.println(5 | 9);
		
		
		//将输出4
		System.out.println(~-5);
		//将输出12
		System.out.println(5 ^ 9);
		
		
		//输出20
		System.out.println(5 << 2);
		//输出-20
		System.out.println(-5 << 2);
		
		
		//输出-2
		System.out.println(-5 >> 2);
		//输出1073741822
		System.out.println(-5 >>> 2);
		
	}
}