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
public class LocalInnerClass
{
	public static void main(String[] args)
	{
		//����ֲ��ڲ���
		class InnerBase
		{
			int a;
		}
		//����ֲ��ڲ��������
		class InnerSub extends InnerBase
		{
			int b;
		}
		//�����ֲ��ڲ���Ķ���
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub�����a��b Field�ǣ�" + is.a + "," + is.b);
	}
}