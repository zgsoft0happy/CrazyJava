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
public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		//下面定义4格final"宏变量"
		final int a = 5 + 2;
		final double b = 1.2 / 3;
		final String str = "疯狂" + "Java";
		final String book = "疯狂Java讲义：" + 99.0;
		//下面的book2变量的值因为调用了方法所以无法在编译时被确定下来
		final String book2 = "疯狂Java讲义：" + String.valueOf(99.0);	//1
		System.out.println(book == "疯狂Java讲义：99.0");
		System.out.println(book2 == "疯狂Java讲义：99.0");
	}
}