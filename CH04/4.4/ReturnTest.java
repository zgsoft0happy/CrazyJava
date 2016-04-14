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
public class ReturnTest
{
	public static void main(String[] args)
	{
		//一个简单的for循环
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("i的值是：" + i);
			if (i == 1)
			{
				return ;
			}
			System.out.println("return后的输出语句");
		}
	}
}