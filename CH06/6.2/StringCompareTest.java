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
public class StringCompareTest
{
	public static void main(String[] args)
	{
		//s1ֱ�����ó������е�"���Java"
		String s1 = "���Java";
		String s2 = "���";
		String s3 = "Java";
		//s4������ַ���ֵ�����ڱ�������ȷ������
		//s4ֱ�����ó������е�"���Java"
		String s4 = "���" + "Java";
		//s5������ַ���ֵ�����ڱ�������ȷ������
		//s5ֱ�����ó������е�"���Java"
		String s5 = "��" + "��" + "Java";
		//s6������ַ���ֵ�����ٱ�������ȷ������
		//�������ó������е��ַ���
		String s6 = s2 + s3;
		//ʹ��new���ù��������ᴴ��һ���µ�String����
		//s7���ö��ڴ����´�����String����
		String s7 = new String("���Java");
		//���true
		System.out.println(s1 == s4);
		//���true
		System.out.println(s1 == s5);
		//���false
		System.out.println(s1 == s6);
		//���false 
		System.out.println(s1 == s7);
	}
}