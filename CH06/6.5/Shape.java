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
public abstract class Shape
{
	{
		System.out.println("ִ��Shape�ĳ�ʼ����...");
	}
	private String color;
	//����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	//����һ��������״�ĳ��󷽷�
	public abstract String getType();
	//����Shape�Ĺ��������Ĺ��������������ڴ���Shape����
	//�������ڱ��������
	public Shape(){}
	public Shape(String color)
	{
		System.out.println("ִ��Shape�Ĺ�����...");
		this.color = color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
}