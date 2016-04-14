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
public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp()
	{
		//System.out.println(prop1);
		//上面代码出现错误，应改为如下形式
		//通过类名访问静态内部类的类成员
		System.out.println(StaticInnerClass.prop1);
		//System.out.println(prop2);
		//上面代码出现错误，应改为如下形式
		//通过实例访问内部类的实例成员
		System.out.println(new StaticInnerClass().prop2);
	}
}