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
 public class CharTest
 {
	 public static void main(String[] args)
	 {
		 //ֱ��ָ�������ַ���Ϊ�ַ����ͳ���
		 char aChar = 'a';
		 //ʹ��ת���ַ�����Ϊ�ַ����ͳ���
		 char enterChar = '\r';
		 //ʹ��Unicode����ֵ��ָ���ַ����ͳ���
		 char ch = '\u9999';
		 //�����һ��'��'�ַ�
		 System.out.println(ch);
		 //����һ��'�衯�ַ����ͳ���
		 char zhong = '��';
		 //ֱ�ӽ�һ��char���ͱ�������int���ͱ���ʹ��
		 int zhongValue = zhong;
		 System.out.println(zhongValue);
		 //ֱ�Ӱ�0��65535��Χ�ڵ�һ��int��������һ��char���ͱ���
		 char c = 97;
		 System.out.println(c);
		 
		 
		 //������붨��һ��s����������һ���ַ���ʵ�������ã���һ���������͵ı���
		 String  s = "�׺����������ᣬ������ů�����̡�";
	 }
 }