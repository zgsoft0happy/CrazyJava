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
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public void info()
	{
		System.out.println("������Ϊ��" + name);
	}
}
public class PrintObject
{
	public static void main(String[] args)
	{
		//����һ��Person���󣬽�֮����p����
		Person p = new Person("�����");
		//��ӡp�����õ�Person����
		System.out.println(p);
	}
}