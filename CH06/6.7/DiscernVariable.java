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
public class DiscernVariable
{
	private String prop = "外部类的实例变量";
	private class InClass
	{
		private String prop = "内部类的实例变量";
		public void info()
		{
			String  prop = "局部变量";
			//通过 外部类类名.this.varName 访问外部类实例Field
			System.out.println("外部类的Field值：" + DiscernVariable.this.prop);
			//通过 this.varName 访问内部类实例的Field
			System.out.println("内部类的Field值：" + this.prop);
			//直接访问局部变量
			System.out.println("局部变量的值：" + prop);
		}
	}
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}
}