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
public class VariableOverrideTest
{
	//����һ��nameʵ��Field
	private String name = "���";
	//����һ��price��Field
	private static double price = 78.0;
	//����������������
	public static void main(String[] args)
	{
		//������ľֲ��������ֲ��������ǳ�Ա������ֵ��65
		System.out.println(price);
		//ʹ��������Ϊprice�������޶�
		//�����price��Field��ֵ��78.0
		System.out.println(VariableOverrideTest.price);
		//����info ����
		new VariableOverrideTest().info();
	}
	public void info()
	{
		//������ľֲ��������ֲ��������ǳ�Ա����
		String name ="�����";
		//ֱ�ӷ���name �����������name�ֲ������� ֵ��"�����"
		System.out.println(name);
		//ʹ��this����Ϊname �������޶�
		//�����nameʵ��Field��ֵ��"���"
		System.out.println(this.name);
	}
}