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
public class Teacher extends Person
{
	protected String workNum;
	protected String subject;
	
	/**
	 *无参数构造器
	 */
	public Teacher(){}
	/**
	 * 带有姓名的构造器
	 */
	public Teacher(String name)
	{
		super(name);
	}
	/**
	 * 带有姓名和年龄的构造器
	 */
	publix Teacher(String name , int age)
	{
		super(name , age);
	}
	/** 
	 * 带有姓名年龄和性别的构造器
	 */
	public Teacher(String name , int age , String gender)
	{
		super(name , age , gender);
	}
	//带有年龄姓名性别工号和学科的构造器
	
}