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
public class StringSwitchTest
{
	public static void main(String[] args)
	{
		//��������season
		String season = "����";
		//ִ��switch��֧���
		switch(season)
		{
			case "����":
				System.out.println("��ů����.");
				break;
			case "����":
				System.out.println("��������.");
				break;
			case "����":
				System.out.println("�����ˬ.");
				break;
			case "����":
				System.out.println("��ѩ����.");
			default:
				System.out.println("�����������");
		}
	}
}