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
import java.io.*;
public class Dog implements Serializable 
{
	public static final long serialVersionUID = 1L;
	public String name;
	public int age;
	public Dog(){}
	public Dog(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	public long getSerialVersionUID()
	{
		return serialVersionUID;
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
	public String toString()
	{
		return "Dog：姓名：" + getName() + "，年龄：" + getAge();
	}
}