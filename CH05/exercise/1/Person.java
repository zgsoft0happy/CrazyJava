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
package yyb;
public class Person
{
	protected String name;	//姓名
	protected int age;	//年龄
	protected String gender;	//性别
	
	/**
	 * 不带任何参数的构造器
	 */
	public Person(){}
	/**
	 * 带有姓名的构造器
	 */
	public Person(String name){
		this.name = name;
	}
	/**
	 * 带有姓名和年龄的构造器
	 */
	public Person(String name, int age)
	{
		this(name);
		this.age = age;
	}
	/**
	 * 同时带有姓名、年龄、性别的构造器
	 */
	public Person(String name , int age , String gender)
	{
		this(name , age);
		this.gender = gender;
	}
	
	/**
	 * 设置人的姓名
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/** 
	 * 获得人的姓名
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * 设置人的年龄
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * 获得人的年龄
	 */
	public int getAge()
	{
		return this.age;
	}
	/**
	 * 设置人的性别
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	/**
	 * 获得人的性别
	 */
	public String getGender()
	{
		return this.gender;
	}
	
	/**
	 * 获得人的全部信息的字符串
	 */
	public String toString()
	{
		return "姓名：" + getName() + "，年龄：" + getAge() + "，性别：" + getGender();
	}
}