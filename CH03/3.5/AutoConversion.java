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
public class AutoConversion
{
	public static void main(String[] args)
	{
		int a = 6;
		//int���Ϳ����Զ�ת��Ϊfloat����
		float f = a;
		//���潫���6.0
		System.out.println(f);
		//����һ��byte���͵���������
		byte b = 9;
		//������뽫����byte���Ͳ����Զ�����ת��Ϊchar����
		//char c = b;
		//byte���ͱ��������Զ�����ת��Ϊdouble����
		double d = b;
		//���潫���9.0
		System.out.println(d);
	}
}