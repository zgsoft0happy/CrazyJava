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
public class SeasonTest
{
	public SeasonTest(Season s)
	{
		System.out.println(s.getName() + "，这真是一个" + s.getDesc() + "的季节");
	}
	public static void main(String[] args)
	{
		//直接使用Season的FALL常量代表一个Season对象
		new SeasonTest(Season.FALL);
	}
}