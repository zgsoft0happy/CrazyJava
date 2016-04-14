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
public class VariableOverrideTest
{
	//定义一个name实例Field
	private String name = "李刚";
	//定义一个price类Field
	private static double price = 78.0;
	//主方法，程序的入口
	public static void main(String[] args)
	{
		//方法里的局部变量，局部变量覆盖成员变量的值：65
		System.out.println(price);
		//使用类名作为price变量的限定
		//将输出price类Field的值：78.0
		System.out.println(VariableOverrideTest.price);
		//运行info 方法
		new VariableOverrideTest().info();
	}
	public void info()
	{
		//方法里的局部变量，局部变量覆盖成员变量
		String name ="孙悟空";
		//直接访问name 变量，将输出name局部变量的 值："孙悟空"
		System.out.println(name);
		//使用this来作为name 变量的限定
		//将输出name实例Field的值："李刚"
		System.out.println(this.name);
	}
}