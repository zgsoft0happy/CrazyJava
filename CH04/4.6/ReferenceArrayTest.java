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
class Person
{
	//����
	public int age;
	//���
	public double height;
	//����һ��info����
	public void info()
	{
		System.out.println("�ҵ������ǣ�" + age + "���ҵ�����ǣ�" + height);
	}
}

public class ReferenceArrayTest
{
	public static void main(String[] arsg)
	{
		//����һ��students�����������������Personp[]
		Person[] students;
		//ִ�ж�̬��ʼ��
		students = new Person[2];
		//����һ��Personʵ�����������Personʵ������zhang����
		Person zhang = new Person();
		//Ϊzhang�����õ�Person�����age��height��ֵ
		zhang.age = 15;
		zhang.height = 158;
		//����һ��Personʵ�����������Personʵ������lee����
		Person lee = new Person();
		//Ϊlee�����õ�Person�����age��height��ֵ
		lee.age = 16;
		lee.height = 161;
		//��zhang������ֵ������һ������Ԫ��
		students[0] = zhang;
		//��lee������ֵ�����ڶ�������Ԫ��
		students[1] = lee;
		//�������д���Ľ����ȫһ������Ϊlee
		//��students[1]ָ�����ͬһ��Personʵ��
		lee.info();
		students[1].info();
	}
}