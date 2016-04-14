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
import java.util.EnumMap;
enum Season
{
	SPRING , SUMMER , FALL , WINTER
}
public class EnumMapTest
{
	public static void main(String[] args)
	{
		//创建一个EnumMap对象，该EnumMap的所有key
		//必须是Season枚举类的枚举值
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER , "夏日炎炎");
		enumMap.put(Season.SPRING , "春暖花开");
		System.out.println(enumMap);
	}
}