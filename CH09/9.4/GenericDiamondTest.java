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
class MyClass<E>
{
	public <T> MyClass(T t)
	{
		System.out.println("t������ֵΪ��" + t);
	}
}
public class GenericDiamondTest
{
	public static void main(String[] args)
	{
		//MyClass�������е�E�β���String����
		//���͹�������������T�β���Integer����
		MyClass<String> mc1 = new MyClass<>(5);
		//��ʽָ�����͹�������������T�β���Integer����
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		//MyClass�������е�E�β���String����
		//�����ʽָ�����͹�������������T�β���Integer����
		//��ʱ�Ͳ���ʹ��"����"�﷨����������Ǵ��
		//MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}