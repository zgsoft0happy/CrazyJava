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
public class Apple
{
	public String name;
	public String color;
	public double weight;
	public Apple()
	{
	}
	//���������Ĺ�����
	public Apple(String name,String color)
	{
		this.name = name;
		this.color = color;
	}
	//���������Ĺ�����
	public Apple(String name, String color, double weight)
	{
		//ͨ��this������һ�����صĹ������ĳ�ʼ������
		this(name, color);
		//����this���øù��������ڳ�ʼ����Java����
		this.weight = weight;
	}
}