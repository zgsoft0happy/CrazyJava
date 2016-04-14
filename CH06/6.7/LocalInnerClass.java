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
public class LocalInnerClass
{
	public static void main(String[] args)
	{
		//定义局部内部类
		class InnerBase
		{
			int a;
		}
		//定义局部内部类的子类
		class InnerSub extends InnerBase
		{
			int b;
		}
		//创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub对象的a和b Field是：" + is.a + "," + is.b);
	}
}