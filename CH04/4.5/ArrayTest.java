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
public class ArrayTest
{
	public static void main(String[] args)
	{
		//����һ��int�������͵ı�����������ΪintArr
		int[] intArr;
		//ʹ�þ�̬��ʼ������ʼ������ʱָֻ������Ԫ�صĳ�ʼֵ����ָ�����鳤��
		intArr = new int[]{5, 6, 8, 20};
		//����һ��Object�������͵����ȣ�������ΪobjArr
		Object[] objArr;
		//ʹ�þ�̬��ʼ������ʼ������Ԫ�ص�������
		//��������ʱ����Ԫ�����͵�����
		objArr = new String[]{"Java","���"};
		Object[] objArr2;
		//ʹ�þ�̬��ʼ��
		objArr2 = new Object[]{"Java","���"};
		
		
		//����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ü򻯵ľ�̬��ʼ��д��
		int[] a = {5,6,7,9};
		
		//����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ö�̬��ʼ���﷨
		int[] prices = new int[5];
		//����Ķ���ͳ�ʼ��ͬʱ��ɣ���ʼ��������Ԫ�ص������Ƕ�������Ԫ��ʱԪ�����͵�����
		Object[] books = new String[4];
		
		//���objArr����ĵڶ���Ԫ�أ�������ַ���"���"
		System.out.println(objArr[1]);
		//ΪobjArr2�ĵ�һ������Ԫ�ظ�ֵ
		objArr2[0] = "Spring";
		
		//��������Ԫ���ƶ�������ֵ�������鳤�ȣ�����������뽫������ʱ�����쳣
		//System.out.println(objArr2[2]);
		
		//ʹ��ѭ�����prices�����ÿ������Ԫ�ص�ֵ
		for(int i = 0 ; i < prices.length; i++)
		{
			System.out.println(prices[i]);
		}
		
		//�Զ�̬��ʼ���������Ԫ�ؽ��и�ֵ
		books[0] = "���Java����";
		books[1] = "������Java EE��ҵӦ��ʵս";
		//ʹ��ѭ�����books�����ÿ������Ԫ�ص�ֵ
		for(int i = 0 ; i < books.length ; i++)
		{
			System.out.println(books[i]);
		}
	}
}