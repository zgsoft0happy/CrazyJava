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
class Foo
{
	public <T> Foo(T t)
	{
		System.out.println(t);
	}
}
public class GenericConstructor
{
	public static void main(String[] args)
	{
		//���͹������е�T����ΪString
		new Foo("���Java����");
		//���͹������е�T����ΪInteger
		new Foo(200);
		//��ʽָ�����͹������е�T����ΪString
		//����Foo��������ʵ��Ҳ��String������ȫ��ȷ
		new <String> Foo("���Android����");	//1
		//��ʽָ�����͹������е�T����ΪString
		//������Foo��������ʵ����Double��������������
		new <String> Foo(12.3);	//2
	}
}