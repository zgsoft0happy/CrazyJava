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
interface A
{
	void test();
}
public class ATest
{
	public static void main(String[] args)
	{
		int age = 0;
		A a = new A()
		{
			public void test()
			{
				//下面语句将提示错误：
				//匿名内部类内访问局部变量必须使用final修饰
				System.out.println(age);
			}
		};
	}
}