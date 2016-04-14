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
public class FinalErrorTest
{
	//定义一个final修饰的Field
	//系统不会对final成员Field进行默认初始化
	final int age;
	{
		//age没有初始化，所以此处代码将引起错误
		//System.out.println(age);
		age = 6;
		System.out.println(age);
	}
	public static void main(String[] args)
	{
		new FinalErrorTest();
	}
}