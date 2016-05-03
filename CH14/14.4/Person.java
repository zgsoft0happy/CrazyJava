/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.lang.annotation.*;
@Persistent(table="person_inf")
public class Person
{
	@Id(column="person_id" , type="integer" , generator="identity")
	private int id;
	@Property(column="person_name" , type="string")
	private String name;
	@Property(column="person_age" , type="integer")
	private int age;
	//无参数的构造器
	public Person(){}
	//初始化全部成员变量的构造器
	public Person(int id , String name , int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}