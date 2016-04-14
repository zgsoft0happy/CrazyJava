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
public enum Gender implements GenderDesc
{
	//此处的枚举值必须调用对应的构造器来创建
	MALE("男"),FEMALE("女");
	private final String name;
	//枚举类的构造器只能使用private修饰
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//增加下面的info方法，实现GenderDesc接口必须实现的方法
	public void info()
	{
		System.out.println("这是一个用于定义性别Field的枚举类");
	}
}