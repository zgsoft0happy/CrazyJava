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
public class ForTest2
{
	public static void main(String[] args)
	{
		//同时定义了三个初始化变量，使用&&来组合多个boolean表达式
		for(int b = 0 , s = 0 , p = 0 ; b < 10 && s < 4 && p < 10 ; p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}