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
public class OutputPropertyTest
{
	public static void main(String[] args)
	{
		//访问另一个包中的Output接口的MAX_CACHE_LINE
		System.out.println(Output.MAX_CACHE_LINE);
		//下面语句将引起“为final变量赋值”的编译异常
		//yyb.Output.MAX_CACHE_LINE = 20;
	}
}