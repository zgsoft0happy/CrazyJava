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
import java.util.PriorityQueue;
public class PriorityQueueTest
{
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		//�������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		//���pq���У������ǰ�Ԫ�صļ���˳������
		//���ǰ�Ԫ�صĴ�С˳�����У����[-3, 0, 9, 6]
		System.out.println(pq);
		//���ʶ��еĵ�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.poll());
	}
}