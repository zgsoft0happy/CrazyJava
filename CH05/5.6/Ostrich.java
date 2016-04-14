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
public class Ostrich extends Bird
{
	//重写Bird类的fly方法
	public void fly()
	{
		System.out.println("我只能在地上奔跑...");
	}
	public static void main(String[] args)
	{
		//创建Ostrich对象
		Ostrich os = new Ostrich();
		//执行Ostrich对象的fly方法，将输出“我只能在地上奔跑...”
		os.fly();
	}
}