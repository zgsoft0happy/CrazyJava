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
class StaticOut
{
	//����һ����̬�ڲ��࣬�����÷��ʿ��Ʒ�
	//��ͬһ�����е�������ɷ��ʸ��ڲ���
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		/*
		�������ɸ�Ϊ�������д��룺
		ʹ��OuterClass.InnerClass����ʽ�����ڲ������
		StaticOut.StaticIn in;
		ͨ��new�������ڲ��๹����������̬�ڲ���ʵ��
		in = new StaticOut.StaticIn();
		*/
	}
}