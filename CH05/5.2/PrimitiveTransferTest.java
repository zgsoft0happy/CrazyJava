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
public class PrimitiveTransferTest
{
	public static void swap(int a,int b)
	{
		//�������д���ʵ��a��b������ֵ����
		//����һ����ʱ����������a������ֵ
		int tmp = a;
		//��b��ֵ����a
		a = b;
		//����ʱ����tmp��ֵ����a
		b = tmp;
		System.out.println("swap�����a��ֵ��" + a + "��b��ֵ��" + b);
	}
	public static void main(String[] args)
	{
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("���������󣬱���a��ֵ��" + a +"������b��ֵ��" +b);
	}
}