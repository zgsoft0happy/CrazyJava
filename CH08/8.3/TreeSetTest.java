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
import java.util.TreeSet;
public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		//��TreeSet������ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		//�������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		//��������еĵ�һ��Ԫ��
		System.out.println(nums.first());
		//�������������һ��Ԫ��
		System.out.println(nums.last());
		//����С��4���Ӽ���������4
		System.out.println(nums.headSet(4));
		//���ش���5���Ӽ������Set�а���5���Ӽ���Ҳ����5
		System.out.println(nums.tailSet(5));
		//���ش��ڵ���-3��С��4���Ӽ�
		System.out.println(nums.subSet(-3 , 4));
	}
}