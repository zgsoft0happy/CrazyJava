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
public class Teacher extends Person
{
	protected String workNum;
	protected String subject;
	
	/**
	 *�޲���������
	 */
	public Teacher(){}
	/**
	 * ���������Ĺ�����
	 */
	public Teacher(String name)
	{
		super(name);
	}
	/**
	 * ��������������Ĺ�����
	 */
	publix Teacher(String name , int age)
	{
		super(name , age);
	}
	/** 
	 * ��������������Ա�Ĺ�����
	 */
	public Teacher(String name , int age , String gender)
	{
		super(name , age , gender);
	}
	//�������������Ա𹤺ź�ѧ�ƵĹ�����
	
}