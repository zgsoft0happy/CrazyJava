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
class Person
{
	private String name;
	private String idStr;
	public Person(){}
	public Person(String name , String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setIdStr(String idStr)
	{
		this.idStr = idStr;
	}
	public String getIdStr()
	{
		return this.idStr;
	}
	
	public boolean equals(Object obj)
	{
		//如果两个对象为同个一对象
		if (this == obj)
			return true;
		//当obj不为null，且它是Person类的实例时
		if (obj != null && obj.getClass()  == Person.class)
		{
			Person personObj = (Person)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
			if (this.getIdStr().equals(personObj.getIdStr()))
			{
				return true;
			}
		}
		return false;
	}
}
public class OverrideEqualsRight
{
	public static void main(String[] args)
	{
		Person p1 = new Person("孙悟空" , "12343433433");
		Person p2 = new Person("孙行者" , "12343433433");
		
		Person p3 = new Person("孙悟饭" , "99933433");
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等？" + p1.equals(p2));
		//p2和p3的idStr不相等，所以输出false
		System.out.println("p2和p3是否相等？" + p2.equals(p3));
	}
}