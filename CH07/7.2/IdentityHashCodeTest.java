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
public class IdentityHashCodeTest
{
	public static void main(String[] args) 
	{
		//���������s1��s2��������ͬ�Ķ���
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String��д��hashCod()��������������Ϊ�����ַ����м���hashCodeֵ
		//��Ϊs1��s2���ַ�������ͬ���������ǵ�hashCode()��������ֵ��ͬ
		System.out.println(s1.hashCode() + " ---- " + s2.hashCode());
		//s1��s2�ǲ�ͬ���ַ��������������ǵ�IdentityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1) + " ---- " + System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		//s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3) + " ---- " + System.identityHashCode(s4));
	}
}