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
public enum Gender1 implements GenderDesc
{
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
	MALE("��")
	//�����Ų���ʵ������һ�����岿��
	{
		public void info()
		{
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů")
	{
		public void info()
		{
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender1(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}