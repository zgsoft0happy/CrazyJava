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
class Creature
{
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal extends Creature
{
	public Animal(String name)
	{
		System.out.println("Animal��һ�������Ĺ�������" + "�Ķ����nameΪ" + name);
	}
	public Animal(String name,int age)
	{
		//ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�����������Ĺ�������" + "��ageΪ" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{
		//��ʽ���ø��������������Ĺ�����
		super("��̫��",3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args)
	{
		new Wolf();
	}
}