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
class Bird 
{
	//将原来的父类嵌入到原来的子类，作为子类的一个组合成份
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	//重新定义一个自己的breath方法
	public void breath()
	{
		//直接复用Animal提供的breath方法来实现Bird的breath方法
		a.breath();
	}
	public void fly()
	{
		System.out.println("我在天空自在的飞翔...");
	}
}
class Wolf
{
	//将原来的父类嵌入原来的子类，作为子类的一个组合成份
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	//重新定义一个自己的breath方法
	public void breath()
	{
		//直接复用Animal提供的breath方法来实现Wolf的breath方法
		a.breath();
	}
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		//此时需要显式创建被嵌入的对象
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//此时需要显式创建被嵌入的对象
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}