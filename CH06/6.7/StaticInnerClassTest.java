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
public class StaticInnerClassTest
{
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		//��̬�ڲ�������԰�����̬��Ա
		private static int age;
		public void accessOuterProp()
		{
			//���������ִ���
			//��̬�ڲ����޷������ⲿ���ʵ����Ա
			//System.out.println(prop1);
			//�����������
			System.out.println(prop2);
		}
	}
}