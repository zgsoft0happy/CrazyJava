/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
public class Fruit
{
	public void info()
	{
		System.out.println("水果的info方法...");
	}
}
class Apple extends Fruit
{
	//使用@Override制定下面方法必须重写父类方法
	@Override
	public void info()
	{
		System.out.println("苹果重写水果的info方法...");
	}
}