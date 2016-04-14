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
import java.util.*;
public class PerformanceTest
{
	public static void main(String[] args)
	{
		//����һ���ַ�������
		String[] tst1 = new String[90000];
		//��̬��ʼ������Ԫ��
		for (int i = 0 ; i < 90000 ; i++)
		{
			tst1[i] = String.valueOf(i);
		}
		ArrayList al =  new ArrayList();
		//�����е�����Ԫ�ؼ���ArrayList������
		for (int i = 0 ; i < 90000 ; i++)
		{
			al.add(tst1[i]);
		}
		LinkedList ll = new LinkedList();
		//�����е�����Ԫ�ؼ���LinkedList������
		for (int i = 0 ; i < 90000 ; i++)
		{
			ll.add(tst1[i]);
		}
		//��������ArrayList���ϵ�����Ԫ�أ����������ʱ��
		long start = System.currentTimeMillis();
		for (Iterator it = al.iterator() ; it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����ArrayList����Ԫ�ص�ʱ�䣺" 
			+ (System.currentTimeMillis() - start));
			//��������LinkedList���ϵ�����Ԫ�أ����������ʱ��
		start = System.currentTimeMillis();
		for (Iterator it = ll.iterator() ; it.hasNext() ; )
		{
			it.next();
		}
		System.out.println("����LinkedList����Ԫ�ص�ʱ�䣺"
			+ (System.currentTimeMillis() - start));
	}
}