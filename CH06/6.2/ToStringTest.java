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
class Apple{
	private String color;
	private double weight;
	public Apple(){ }
	//�ṩ�в����Ĺ�����
	public Apple(String color , double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return this.weight;
	}
	
	public String toString()
	{
		return "һ��ƻ������ɫ�ǣ�" + color + "�������ǣ�" + weight;
	}
}
public class ToStringTest
{
	public static void main(String[] args)
	{
		Apple a = new Apple("��ɫ" , 5.68);
		//��ӡApple����
		System.out.println(a);
	}
}