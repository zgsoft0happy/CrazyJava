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
public class Apple extends Fruit
{
	public static void main(String[] args)
	{
		//创建Apple对象
		Apple a = new Apple();
		//Apple对象本省没有weight Field
		//因为Apple的父类有weight Field，也可以访问Apple独享的Field
		a.weight = 56;
		//调用Apple对象的info方法
		a.info();
	}
}