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
public class Apple<T extends Number>
{
	T col;
	public static void main(String[] args)
	{
		Apple<Double> ad = new Apple<>();
		Apple<Integer> ai = new Apple<>();
		//下面代码将引发编译异常，下面代码试图把String类型传给T形参
		//但String不是Number的子类型，所以引起编译错误
		Apple<String> as = new Apple<>();	//1
	}
}