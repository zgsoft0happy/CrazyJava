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
public class EqualTest
{
	public static void main(String[] args)
	{
		int it = 65;
		float f1 = 65.0f;
		//将输出true;
		System.out.println("65和65.0是否相等？" + (it == f1));
		char ch = 'A';
		//将输出true;
		System.out.println("65和'A'是否相等？" + (it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		//将输出false
		System.out.println("str1和str2是否相等？" + (str1 == str2));
		//将输出true
		System.out.println("str1是否equals str2？" + (str1.equals(str2)));
		//由于java.lang.String与EqualsTest类没有继承关系
		//所以下面语句导致编译错误
		//System.out.println("hello" == new EqualTest());
	}
}