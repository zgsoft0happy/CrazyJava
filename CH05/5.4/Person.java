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
public class Person
{
	//��Fieldʹ��private ���Σ�����ЩField��������
	private String name;
	private int age;
	//�ṩ����������name Field
	public void setName(String name)
	{
		//ִ�к�����У�飬Ҫ���û���������2~6λ֮��
		if(name.length() > 6 || name.length() < 2)
		{
			System.out.println("�����õ�����������Ҫ��");
			return;
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		return this.name;
	}
	//�ṩ����������age Field
	public void setAge(int age)
	{
		//ִ�к�����У�飬Ҫ���û����������0~100֮��
		if(age > 100 || age < 0)
		{
			System.out.println("�����õ����䲻�Ϸ�");
			return;
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
}