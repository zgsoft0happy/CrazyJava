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
public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		//���涨��4��final"�����"
		final int a = 5 + 2;
		final double b = 1.2 / 3;
		final String str = "���" + "Java";
		final String book = "���Java���壺" + 99.0;
		//�����book2������ֵ��Ϊ�����˷��������޷��ڱ���ʱ��ȷ������
		final String book2 = "���Java���壺" + String.valueOf(99.0);	//1
		System.out.println(book == "���Java���壺99.0");
		System.out.println(book2 == "���Java���壺99.0");
	}
}