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
public class Recursive
{
	public static int fn(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else if(n == 1)
		{
			return 4;
		}
		else
		{
			//�����е������������Ƿ����ݹ�
			return 2 * fn(n - 1) + fn(n - 2);
		}
	}
	public static void main(String[] args)
	{
		//���fn(10)�Ľ��
		System.out.println(fn(10));
	}
}