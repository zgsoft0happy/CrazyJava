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
public class ImmutableStringTest
{
	public static void main(String[] args)
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//输出false
		System.out.println(str1 == str2);
		//输出true
		System.out.println(str1.equals(str2));
		//下面两次输出的hashCode相同
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}