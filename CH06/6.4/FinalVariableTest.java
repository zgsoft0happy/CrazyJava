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
public class FinalVariableTest
{
	//�����Ա����ʱ�ƶ�Ĭ��ֵ���Ϸ�
	final int a = 6;
	//����������ڹ��������ʼ�����з����ʼֵ
	final String str;
	final int c;
	final static double d;
	//��û���ƶ�Ĭ��ֵ����û���ڳ�ʼ����/���������ƶ���ʼֵ
	//���涨��char Field�ǲ��Ϸ���
	//final char ch;
	//��ʼ���飬�ɶ�û���ƶ�Ĭ��ֵ��ʵ��Field�ƶ���ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ��Field�ƶ���ʼֵ���Ϸ�
		str = "Hello";
		//����a Field ʱ�Ѿ��ƶ���Ĭ��ֵ
		//����Ϊa���¸�ֵ�����渳ֵ���Ƿ�
		//a = 9;
	}
	//��̬��ʼ���飬�Ͷ�û��ָ��Ĭ��ֵ����Fieldָ����ʼֵ
	static 
	{
		//�ھ�̬��ʼ����Ϊ��Fieldָ����ʼֵ���Ϸ�
		d = 5.6;
	}
	//���������ɶԼ�û���ƶ�Ĭ��ֵ����û���ڳ�ʼ������
	//ָ����ʼֵ��ʵ��Field�ƶ���ʼֵ
	public FinalVariableTest()
	{
		//�����ʼ�����ж�str��ָ���˳�ʼֵ
		//�������в��ܶ�final�������¸��ƣ����渳ֵ���Ƿ�
		//str = "java";
		c = 5;
	}
	public void changeFinal()
	{
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		//d = 1.2;
		//��������ͨ��������final��Ա�����ƶ���ʼֵ
		//ch = 'a';
	}
	public static void main(String[] args)
	{
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}
}