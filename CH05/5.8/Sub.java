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
class Base
{
	public Base()
	{
		test();
	}
	public void test()		//1号test方法
	{
		System.out.println("将被子类红血的方法");
	}
}
public class Sub extends Base
{
	private String name;
	public void test()			//2号test方法
	{
		System.out.println("子类重写父类的方法，其name字符串长度" + name.length());
	}
	public static void main(String[] args)
	{
		//下面代码会引发空指针异常
		Sub s = new Sub();
	}
}