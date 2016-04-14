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
public class TeachableProgrammer extends Programmer
{
	public TeachableProgrammer(){}
	public TeachableProgrammer(String name)
	{
		super(name);
	}
	//教学工作依然由TeachableProgrammer类定义
	private void teach()
	{
		System.out.println(getName() + "教师在讲台上讲解...");
	}
	private class Closure implements Teachable
	{
		/*
		非静态内部类毁掉外部类实现work方法，非静态内部类引用的作用仅仅是
		向客户提供一个毁掉外部类的途径
		*/
		public void work()
		{
			teach();
		}
	}
	//返回一个非静态内部类引用，允许外部类通过该静态内部类引用来回调外部类的方法
	public Teachable getCallbackReference()
	{
		return new Closure();
	}
}