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
class Animal
{
	private void beat()
	{
		System.out.println("心脏跳动...");
	}
	public void breath()
	{
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}
//继承Animal，直接复用父类的breath方法
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("我在天空自在的飞翔...");
	}
}
//继承Animal，直接复用父类的breath方法
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.breath();
		b.fly();
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}