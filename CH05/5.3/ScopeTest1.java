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
public class ScopeTest1
{
	//定义一个类成员变量作为循环变量
	static int i;
	public static void main(String[] args)
	{
		for(i= 0 ; i < 10 ; i++)
		{
			System.out.println("Hello");
		}
	}
}