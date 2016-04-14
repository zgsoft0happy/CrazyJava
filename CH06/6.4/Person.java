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
		Name n = new Name("悟空" , "孙");
		Person p = new Person(n);
		//Person对象的name的firstName值为"悟空"
		System.out.println(p.getName().getFirstName());
		//改变Person对象的name的firstName值、
		n.setFirstName("八戒");
		//Person对象的name的firstName值被改为"八戒"
		System.out.println(p.getName().getFirstName());
	}
}