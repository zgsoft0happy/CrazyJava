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
class Singleton
{
	//使用一个变量来缓存曾经创建的实例
	private static Singleton instance;
	//对构造器使用private修饰，隐藏该构造器
	private Singleton(){}
	//提供一个静态方法，用于返回Singleton实例
	//该方法可以加入自定义控制，保证只产生一个Singleton对象
	public static Singleton getInstance()
	{
		//如果instance为null，则表明还不曾创建Singleton对象
		//如果instance不为null，则表明已经创建了Singleton对象
		//将不会重新创建新的实例
		if (instance == null)
		{
			//创建一个Singleton对象，病将其缓存起来
			instance = new Singleton();
		}
		return instance;
	}
}
public class SingletonTest
{
	public static void main(String[] args)
	{
		//创建SingleTon对象不能通过构造器
		//只能通过getInstance方法来得到实例
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//将输出true
		System.out.println(s1 == s2);
	}
}