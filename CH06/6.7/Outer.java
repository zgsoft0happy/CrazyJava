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
public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void accessOuterProp()
		{
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
			System.out.println("�ⲿ���outPropֵ��" + outProp);
		}
	}
	public void accessInnerProp()
	{
		//�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ��Field
		//���������ֱ������
		//System.out.println("�ڲ����inPropֵ��" + inProp);
		//��������ڲ����ʵ��Field���������ʽ�����ڲ������
		System.out.println("�ڲ����inPropֵ��" + new Inner().inProp);
	}
	public static void main(String[] args)
	{
		//ִ������Ĵ��룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();		//1
		out.accessInnerProp();
	}
}