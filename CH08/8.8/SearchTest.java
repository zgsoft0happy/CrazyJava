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
import java.util.Collections;
import java.util.ArrayList;
public class SearchTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		//�����[2, -5, 3, 0]
		System.out.println(nums);
		//������Ԫ�أ������3
		System.out.println(Collections.max(nums));
		//�����СԪ�أ������-5
		System.out.println(Collections.min(nums));
		//��nums�е�0ʹ��1������
		Collections.replaceAll(nums , 0 , 1);
		//�����[2, -5, 3, 1];
		System.out.println(nums);
		//�ж�-5��List�����г��ֵĴ���������1
		System.out.println(Collections.frequency(nums , -5));
		//��nums��������
		Collections.sort(nums);
		//�����[-5, 1, 2,3]
		System.out.println(nums);
		//ֻ��������List���ϲſ��ö��ַ���ѯ�����3��
		System.out.println(Collections.binarySearch(nums , 3));
	}
}