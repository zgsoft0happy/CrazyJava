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
class Parent
{
	public String tag = "疯狂Java讲义";			//1
}
class Derived extends Parent
{
	//定义一个私有的tag实例变量来隐藏父类的tag实例变量
	private String tag = "轻量级Java EE企业应用实战";		//2
}
public class HideTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		//程序不可访问d的私有变量tag，所以下面语句将引起编译错误
		//System.out.println(d.tag);		//3
		//程序将输出：”疯狂Java讲义“
		System.out.println(((Parent)d).tag);
	}
}