/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
public class Person implements Serializable
{
	private String name;
	private int age;
	//ע��˴�û���ṩ�޲����Ĺ�����
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
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
	private void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}
	public void readExternal(ObjectInput in) throws IOException , ClassNotFoundException
	{
		this.name = ((StringBuffer)in.readObject().reverse().toString();
		this.age = in.readInt();
	}
}