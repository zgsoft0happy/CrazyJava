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
public class FinalLocalVariableTest
{
	public void test(final int a)
	{
		//���ܶ�final���ε��βθ�ֵ���������Ƿ�
		//a = 5;
	}
	publicc static void main(String[] args)
	{
		//����final �ֲ�����ʱָ��Ĭ��ֵ����str�����޷����¸�ֵ
		final String str = "hello";
		//���渳ֵ���Ƿ�
		//str = "Java";
		//����final�ֲ�����ʱû��ָ��Ĭ��ֵ����d�����ɱ���ֵһ��
		final double d;
		//��һ�θ���ʼֵ���ɹ�
		d = 5.6;
		//��final�����ظ���ֵ���������Ƿ�
		//d = 3.4;
	}
}