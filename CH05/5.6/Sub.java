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
class Base
{
	public double size;
	public String name;
	public Base(double size,String name)
	{
		this.size = size;
		this.name = name;
	}
}
public class Sub extends Base
{
	public String color;
	public Sub(double size,String name, String color)
	{
		//ͨ��super���������ö��ڹ������ĳ�ʼ������
		super(size, name);
		this.color = color;
	}
	public static void main(String[] args)
	{
		Sub s = new Sub(5.6 , "���Զ���", "��ɫ");
		//���Sub���������Field
		System.out.println(s.size + "--" + s.name + "--" + s.color);
	}
}