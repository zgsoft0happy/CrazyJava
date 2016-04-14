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
public class NestedLoopTest
{
	public static void main(String[] args)
	{
		//外层循环
		for(int i = 0 ; i < 5 ; i++)
		{
			//内层循环
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.println("i的值为：" + i + "  j的值为： " + j);
			}
		}
	}
}