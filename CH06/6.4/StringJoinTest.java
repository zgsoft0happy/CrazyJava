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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		String s1 = "���Java";
		//s2�������õ��ַ��������ڱ���ʱ��ȷ������
		//������ó����������е�"���Java"�ַ���
		String s2 = "���" + "Java";
		System.out.println(s1 == s2);
		//���������ַ���ֱ����
		String str1 = "���";	//1
		String str2 = "java";	//2
		//��str1��str2������������
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}
}