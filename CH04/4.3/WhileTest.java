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
public class WhileTest
{
	public static void main(String[] args)
	{
		//ѭ���ĳ�ʼ������
		int count = 0;
		//��countС��10ʱ��ִ��ѭ����
		while (count < 10)
		{
			System.out.println(count);
			//�������
			count++;
		}
		System.out.println("ѭ������");
		
		count = 0;
		while (count < 10)
		{
			System.out.println("��ִͣ�е���ѭ�� " + count);
			count--;
		}
		System.out.println("��Զ�޷�������ѭ����");
		
		
	}
}