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
 public class Triangle extends Shape
 {
	 //���������ε�����
	 private double a;
	 private double b;
	 private double c;
	 public Triangle(String color , double a , double b , double c)
	 {
		 super(color);
		 this.setSides(a , b , c);
	 }
	 public void setSides(double a ,double b , double c)
	 {
		 if(a >= b + c || b >= a + c || c >= a + b)
		 {
			 System.out.println("����������֮�ͱ�����ڵ�����");
			 return ;
		 }
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	 //��дShape��ļ����ܳ��ĳ��󷽷�
	 public double calPerimeter()
	 {
		 return a + b + c;
	 }
	 //��дShape��ķ�����״�ĳ��󷽷�
	 public String getType()
	 {
		 return "������";
	 }
 }