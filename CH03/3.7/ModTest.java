/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class ModTest
{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double mod = a % b;
		//mod��ֵΪ2.1
		System.out.println(mod);
		//���������NaN
		System.out.println("5��0.0����Ľ���ǣ�" + 5 % 0.0);
		//���������NaN
		System.out.println("-5��0.0����½���ǣ�" + - 5 % 0.0);
		//���0
		System.out.println("0��5.0����½���ǣ�" + 0 % 5.0);
		//���������NaN
		System.out.println("0��0.0����Ľ���ǣ�" + 0 % 0.0);
		//������뽫�����쳣
		//java.lang.ArithmeticException: / by zero
		System.out.println("-5��0����Ľ���ǣ�" + - 5 % 0);
	}
}