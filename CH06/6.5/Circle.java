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
public class Circle extends Shape
{
	private double radius;
	public Circle(String color , double radius)
	{
		super(color);
		this.radius = radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType()
	{
		return getColor() + "Բ��";
	}
	public static void main(String[] args)
	{
		Shape s1 = new Triangle("��ɫ" , 3 , 4 , 5);
		Shape s2 = new Circle("��ɫ" , 3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}