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
package yyb;
public class Person
{
	protected String name;	//����
	protected int age;	//����
	protected String gender;	//�Ա�
	
	/**
	 * �����κβ����Ĺ�����
	 */
	public Person(){}
	/**
	 * ���������Ĺ�����
	 */
	public Person(String name){
		this.name = name;
	}
	/**
	 * ��������������Ĺ�����
	 */
	public Person(String name, int age)
	{
		this(name);
		this.age = age;
	}
	/**
	 * ͬʱ�������������䡢�Ա�Ĺ�����
	 */
	public Person(String name , int age , String gender)
	{
		this(name , age);
		this.gender = gender;
	}
	
	/**
	 * �����˵�����
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/** 
	 * ����˵�����
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * �����˵�����
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * ����˵�����
	 */
	public int getAge()
	{
		return this.age;
	}
	/**
	 * �����˵��Ա�
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	/**
	 * ����˵��Ա�
	 */
	public String getGender()
	{
		return this.gender;
	}
	
	/**
	 * ����˵�ȫ����Ϣ���ַ���
	 */
	public String toString()
	{
		return "������" + getName() + "�����䣺" + getAge() + "���Ա�" + getGender();
	}
}