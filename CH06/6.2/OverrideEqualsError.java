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
//����һ��Person��
class Person
{
	//��дequals�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj)
	{
		//�����жϣ����Ƿ���true����Person�������κζ������
		return true;
	}
}
//����һ��Dog��
class Dog{}
public class OverrideEqualsError
{
	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println("Person�����Ƿ�equals Dog����" + p.equals(new Dog()));
		System.out.println("Person�����Ƿ�equals String����" + p.equals(new String("Hello")));
	}
}