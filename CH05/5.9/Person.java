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
public class Person
{
	//���水����һ����ʼ����
	{
		int a = 6;
		//�ڳ�ʼ������
		if (a > 4)
		{
			System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	//����ڶ�����ʼ����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	//�����޲����Ĺ�����
	public Person()
	{
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}