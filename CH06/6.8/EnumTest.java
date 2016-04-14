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
public class EnumTest
{
	public void judge(SeasonEnum s)
	{
		//switch语句里的表达式可以是枚举值
		switch (s)
		{
			case SPRING:
				System.out.println("春暖花开，正好踏青");
				break;
			case SUMMER:
				System.out.println("夏日炎炎，适合游泳");
				break;
			case FALL:
				System.out.println("秋高气爽，进补及时");
				break;
			case WINTER:
				System.out.println("冬日飘雪，围炉赏雪");
				break;
		}
	}
	public static void main(String[] args)
	{
		//所有的枚举类都有一个values方法，返回该枚举类的所有实例
		for (SeasonEnum s : SeasonEnum.values())
		{
			System.out.println(s);
		}
		//平常使用枚举类实例时
		//总是通过EnumClass.variable的形式来访问
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}