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
class Address
{
	String detail;
	public Address(String detail)
	{
		this.detail = detail;
	}
}
//ʵ�� Cloneable�ӿ�
class User implements Cloneable
{
	int age;
	Address address;
	public User(int age)
	{
		this.age = age;
		address = new Address("�������");
	}
	//ͨ������super.clone()��ʵ��clone()����
	public User clone() throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}
public class CloneTest
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		User u1 = new User(29);
		//clone�õ�u1����ĸ���
		User u2 = u1.clone();
		//�ж�u1��u2�Ƿ���ͬ
		System.out.println(u1 == u2);		//1
		//�ж�u1��u2��address�Ƿ���ͬ
		System.out.println(u1.address == u2.address);		//2
	}
}