/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class ThreeTest
{
	public static void main(String[] rgs)
	{
		String str = 5 > 3 ? "5����3" : "5������3";
		//�����5����3��
		System.out.println(str);
		
		String str2 = null;
		if(5 > 3)
		{
			str2 = "5����3";
		}
		else
		{
			str2 = "5������3";
		}
	}
}