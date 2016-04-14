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
 public class NarrowConversion
 {
	 public static void main(String[] args)
	 {
		 int iValue = 233;
		 //强制把一个int类型的值转化为byte类型的值
		 byte bValue = (byte)iValue;
		 //将输出-23
		 System.out.println(bValue);
		 double dValue = 3.98;
		 //强制把一个double类型的值转化为int类型的值
		 int to1 = (int)dValue;
		 //将输出3
		 System.out.println(to1);
	 }
 }