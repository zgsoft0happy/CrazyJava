/**
 * description£º
 * <br/>ÍøÕ¾£º<a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>CSDNÖ÷Ò³£º<a href="http://my.csdn.net/y1193329479">CSDNÖ÷Ò³</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class DerictValue
{
	public static void main(String[] args)
	{
		int a = 5;
		float f = 5.12f;
		
		
		String s0 = "hello";
		String s1 = "hello";
		String s2 = "he" + "llo";
		System.out.println(s0 == s1);	//true
		System.out.println(s0 == s2);	//true
	}
}