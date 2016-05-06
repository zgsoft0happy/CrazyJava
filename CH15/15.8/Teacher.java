/**
 * <br/>ÍøÕ¾£º<a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>CSDNÖ÷Ò³£º<a href="http://my.csdn.net/y1193329479">CSDNÖ÷Ò³</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-06  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description£º
 */
import java.io.*;
public class Teacher implements Serializable
{
	private String name;
	private Person student;
	public Teacher(String name , Person student)
	{
		this.name = name;
		this.student = student;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setStudent(Person student)
	{
		this.student = student;
	}
	public Person getStudent()
	{
		return this.student;
	}
}