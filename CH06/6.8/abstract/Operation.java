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
public enum Operation
{
	PLUS, MINUS, TIMES, DIVIDE;
	//Ϊö���ඨ��һ������������ʵ�ֲ�ͬ������
	double eval(double x , double y)
	{
		switch (this)
		{
			case PLUS: return x + y;
			case MINUS: return x - y;
			case TIMES: return x * y;
			case DIVIDE: return x / y;
			default: return 0;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(Operation.PLUS.eval(3,4));
		System.out.println(Operation.MINUS.eval(3,4));
		System.out.println(Operation.TIMES.eval(3,4));
		System.out.println(Operation.DIVIDE.eval(3,4));
	}
}