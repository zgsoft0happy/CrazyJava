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
class Name
{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
}
public class Person
{
	private final Name name;
	public Person(Name name)
	{
		this.name = name;
	}
	public Name getName()
	{
		return this.name;
	}
	public static void main(String[] args)
	{
		Name n = new Name("���" , "��");
		Person p = new Person(n);
		//Person�����name��firstNameֵΪ"���"
		System.out.println(p.getName().getFirstName());
		//�ı�Person�����name��firstNameֵ��
		n.setFirstName("�˽�");
		//Person�����name��firstNameֵ����Ϊ"�˽�"
		System.out.println(p.getName().getFirstName());
	}
}