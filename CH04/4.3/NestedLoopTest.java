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
public class NestedLoopTest
{
	public static void main(String[] args)
	{
		//���ѭ��
		for(int i = 0 ; i < 5 ; i++)
		{
			//�ڲ�ѭ��
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.println("i��ֵΪ��" + i + "  j��ֵΪ�� " + j);
			}
		}
	}
}