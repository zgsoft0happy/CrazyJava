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
public class BlockingQueueTest
{
	public static void main(String[] args) throws Exception
	{
		//ָ��һ������Ϊ2����������
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		bq.put("Java");//��bq.add("Java")��bq.offer("java")��ͬ
		bq.put("Java");
		bq.put("Java");//1�����߳�
	}
}