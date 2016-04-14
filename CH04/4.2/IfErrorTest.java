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
public class IfErrorTest
{
	public static void main(String[] args)
	{
		int age = 45;
		if(age > 20)
		{
			System.out.println("青年人");
		}
		else if(age > 40)
		{
			System.out.println("中年人");
		}
		else if(age > 60)
		{
			System.out.println("老年人");
		}
	}
}