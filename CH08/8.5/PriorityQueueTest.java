/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
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
		//下面代码依次向pq中加入四个元素
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		//输出pq队列，并不是暗元素的加入顺序排列
		//而是按元素的大小顺序排列，输出[-3, 0, 9, 6]
		System.out.println(pq);
		//访问队列的第一个元素，其实就是队列中最小的元素：-3
		System.out.println(pq.poll());
	}
}