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
public class EqualTest
{
	public static void main(String[] args)
	{
		int it = 65;
		float f1 = 65.0f;
		//�����true;
		System.out.println("65��65.0�Ƿ���ȣ�" + (it == f1));
		char ch = 'A';
		//�����true;
		System.out.println("65��'A'�Ƿ���ȣ�" + (it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		//�����false
		System.out.println("str1��str2�Ƿ���ȣ�" + (str1 == str2));
		//�����true
		System.out.println("str1�Ƿ�equals str2��" + (str1.equals(str2)));
		//����java.lang.String��EqualsTest��û�м̳й�ϵ
		//����������䵼�±������
		//System.out.println("hello" == new EqualTest());
	}
}