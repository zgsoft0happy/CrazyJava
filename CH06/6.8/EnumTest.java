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
public class EnumTest
{
	public void judge(SeasonEnum s)
	{
		//switch�����ı��ʽ������ö��ֵ
		switch (s)
		{
			case SPRING:
				System.out.println("��ů����������̤��");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ");
				break;
			case FALL:
				System.out.println("�����ˬ��������ʱ");
				break;
			case WINTER:
				System.out.println("����Ʈѩ��Χ¯��ѩ");
				break;
		}
	}
	public static void main(String[] args)
	{
		//���е�ö���඼��һ��values���������ظ�ö���������ʵ��
		for (SeasonEnum s : SeasonEnum.values())
		{
			System.out.println(s);
		}
		//ƽ��ʹ��ö����ʵ��ʱ
		//����ͨ��EnumClass.variable����ʽ������
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}