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
import java.util.EnumSet;
enum Season
{
	SPRING, SUMMER, FALL, WINTER
}
public class EnumSetTest
{
	public static void main(String[] args)
	{
		//创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
		EnumSet es1 = EnumSet.allOf(Season.class);
		//输出[SPRING,SUMMER,FALL,WINTER]
		System.out.println(es1);
		//创建一个EnumSet空集合，指定其集合元素是Season类的枚举值
		EnumSet es2 = EnumSet.noneOf(Season.class);
		//输出[]
		System.out.println(es2);
		//手动添加两个元素
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		//输出[SPRING,WINTER]
		System.out.println(es2);
		//以指定枚举值创建EnumSet集合
		EnumSet es3 = EnumSet.of(Season.SUMMER , Season.WINTER);
		//输出[SUMMER,WINTER]
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SUMMER,Season.WINTER);
		//输出[SUMMER,FALL,WINTER]
		System.out.println(es4);
		//新创建的EnumSet集合元素和es4集合元素有相同的类型
		//es5集合元素 + es4集合元素 = Season枚举类的全部枚举值
		EnumSet es5 = EnumSet.complementOf(es4);
		//输出[SPRING]
		System.out.println(es5);
	}
}