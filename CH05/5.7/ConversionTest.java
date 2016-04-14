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
public class ConversionTest
{
	public static void main(String[] args)
	{
		double d = 3.14;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		//下面代码编译时出错，试图把一个数值类型变量转换为boolean类型
		//编译时会提示：不可转换的类型
		//boolean b = (boolean)in;
		Object obj = "Hello";
		//obj变量的编译时类型为Object，是String类型的父类，可以强制类型转换
		//而且obj变量的类型实际上是String类型，所以运行时也可通过
		String objStr = (String)obj;
		System.out.println(objStr);
		//定义一个objPri变量，编译时类型为Object，实际类型为Integer
		Object objPri = new Integer(5);
		//obPri变量的编译时类型为Object，是String类型的父类
		//所以下面代码运行时引发ClassCastException异常
		String str = (String)objPri;
	}
}