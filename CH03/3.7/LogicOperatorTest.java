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
public class LogicOperatorTest
{
	public static void main(String[] args)
	{
		//ֱ�Ӷ�false������㣬������true
		System.out.println(!false);
		//5>3����true��'6'ת��Ϊ����54,'6'>10����true,����󷵻�true
		System.out.println(5 > 3 && '6' > 10);
		//4>=5����false,'c'>'a'����true�����󷵻�true
		System.out.println(4 >= 5 || 'c' > 'a');
		//4>=5����false,'c'>'a'����true��������ͬ�Ĳ���������򷵻�true
		System.out.println(4 >= 5 ^ 'c' > 'a');
		
		
		//�������a,b����Ϊ����������ֵ
		int a = 5;
		int b = 10;
		//�� a > 4 �� b++ > 10�������
		if (a > 4 | b++ > 10)
		{
			//���a��ֵ��5��b��ֵ��11
			System.out.println("a��ֵ�ǣ�" + a + "  b��ֵ�ǣ�" + b);
		}
		
		
		//�������c,d����Ϊ����������ֵ
		int c = 5;
		int d = 10;
		//c > 4 || d++ > 10�������
		if(c > 4 || d++ > 10)
		{
			//���c��ֵ��5��d��ֵ��10
			System.out.println("c��ֵ�ǣ�" + c + "  d��ֵ�ǣ�" + d);
		}
	}
}