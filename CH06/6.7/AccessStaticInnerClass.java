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
public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp()
	{
		//System.out.println(prop1);
		//���������ִ���Ӧ��Ϊ������ʽ
		//ͨ���������ʾ�̬�ڲ�������Ա
		System.out.println(StaticInnerClass.prop1);
		//System.out.println(prop2);
		//���������ִ���Ӧ��Ϊ������ʽ
		//ͨ��ʵ�������ڲ����ʵ����Ա
		System.out.println(new StaticInnerClass().prop2);
	}
}