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
public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void accessOuterProp()
		{
			//非静态内部类可以直接访问外部类的成员
			System.out.println("外部类的outProp值：" + outProp);
		}
	}
	public void accessInnerProp()
	{
		//外部类不能直接访问非静态内部类的实例Field
		//下面代码出现编译错误
		//System.out.println("内部类的inProp值：" + inProp);
		//如需访问内部类的实例Field，则必须显式创建内部类对象
		System.out.println("内部类的inProp值：" + new Inner().inProp);
	}
	public static void main(String[] args)
	{
		//执行下面的代码，只创建了外部类对象，还未创建内部类对象
		Outer out = new Outer();		//1
		out.accessInnerProp();
	}
}