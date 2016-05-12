/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-12  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.concurrent.*;
import java.util.Random;
//�̳�RecursiveTask��ʵ��"�ɷֽ�"������
class CalTask extends RecursiveTask<Integer>
{
	//ÿ��"С����"���ֻ�ۼ�20����
	private static final int THRESHOLD = 20;
	private int arr[];
	private int start;
	private int end;
	//�ۼӴ�start��end������Ԫ��
	public CalTask(int[] arr , int start , int end)
	{
		this.arr = arr;
		this.start = start;
		this.end = end;
	}
	@Override
	protected Integer compute()
	{
		int sum = 0 ;
		//��end��start֮��Ĳ�С��THRESHOLDʱ����ʼ����ʵ���ۼ�
		if (end - start < THRESHOLD)
		{
			for (int i = start ; i < end ; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
		else 
		{
			//��end��start֮��Ĳ����SHRESHOLD����Ҫ��ӡ��������20��ʱ
			//��������ֽ������"С����"
			int middle = (start + end) / 2;
			CalTask left = new CalTask(arr , start , middle);
			CalTask right = new CalTask(arr , middle , end);
			//����ִ������"С����"
			left.fork();
			right.fork();
			//������"С����"�ۼӵĽ���ϲ�����
			return left.join() + right.join();		//1
		}
	}
}
public class Sum
{
	public static void main(String[] args) throws Exception
	{
		int[] arr = new int[100];
		Random rand = new Random();
		int total = 0;
		//��ʼ��100������Ԫ��
		for (int i = 0 , len = arr.length ; i < len ; i++)
		{
			int tmp = rand.nextInt(20);
			//������Ԫ�ظ��ƣ���������Ԫ�ص�ֵ��ӵ�total�ܺ���
			total += (arr[i] = tmp);
		}
		System.out.println(total);
		ForkJoinPool pool = new ForkJoinPool();
		//�ύ�ɷֽ��CalTask����
		Future<Integer> future = pool.submit(new CalTask(arr , 0 , arr.length));
		System.out.println(future.get());
		//�ر��̳߳�
		pool.shutdown();
	}
}