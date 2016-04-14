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
public enum Gender1 implements GenderDesc
{
	//此处的枚举值必须调用对应的构造器来创建
	MALE("男")
	//花括号部分实际上是一个类体部分
	{
		public void info()
		{
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女")
	{
		public void info()
		{
			System.out.println("这个枚举值代表女性");
		}
	};
	
	private final String name;
	//枚举类的构造器只能使用private修饰
	private Gender1(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}