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
import java.util.ArrayList;
import java.util.Collections;
public class SortTest
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
		//��List����Ԫ�صĴ���ת
		Collections.reverse(nums);
		//�����[0, 3, -5, 2]
		System.out.println(nums);
		//��List����Ԫ�ذ���Ȼ˳������
		Collections.sort(nums);
		//�����[-5, 0, 2, 3]
		System.out.println(nums);
		//��List����Ԫ�ذ����˳������
		Collections.shuffle(nums);
		//ÿ������Ĵ��򲻹̶�
		System.out.println(nums);
	}
}