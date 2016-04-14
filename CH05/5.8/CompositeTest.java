/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
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
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
class Bird 
{
	//��ԭ���ĸ���Ƕ�뵽ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	//���¶���һ���Լ���breath����
	public void breath()
	{
		//ֱ�Ӹ���Animal�ṩ��breath������ʵ��Bird��breath����
		a.breath();
	}
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
class Wolf
{
	//��ԭ���ĸ���Ƕ��ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	//���¶���һ���Լ���breath����
	public void breath()
	{
		//ֱ�Ӹ���Animal�ṩ��breath������ʵ��Wolf��breath����
		a.breath();
	}
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		//��ʱ��Ҫ��ʽ������Ƕ��Ķ���
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//��ʱ��Ҫ��ʽ������Ƕ��Ķ���
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}