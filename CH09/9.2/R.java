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
public class R<T>
{
	//下面代码错误，不能再静态Field声明中使用类型参数
	static T info;
	T age;
	public void foo(T msg){}
	//下面代码错误，不能再静态方法声明中使用类型形参
	public static void bar(T msg){}
}