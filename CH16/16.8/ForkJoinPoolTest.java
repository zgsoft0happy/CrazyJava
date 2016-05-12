/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-12  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.util.concurrent.*;
//继承RecursiveAction来实现“可分解”的任务
class PrintTask extends RecursiveAction
{
	//每个“小人物”最多只打印50个数
	private static final int THRESHOLD = 50;
	private int start;
	private int end;
	//打印从start到end的任务
	public PrintTask(int start , int end)
	{
		this.start = start;
		this.end = end;
	}
	@Override
	protected void compute()
	{
		//当end与start之间的差小鱼THRESHOLD时，开始打印
		if (end - start < THRESHOLD)
		{
			for (int i = start ; i < end ; i++)
			{
				System.out.println(Thread.currentThread().getName() + "的i值：" + i);
			}
		}
		else
		{
			//当end 与start之间的差大于THRESHOLD，即要打印的数超过50个时
			//将大任务分解成两个“小任务”
			int middle = (start + end) / 2;
			PrintTask left = new PrintTask(start , middle);
			PrintTask right = new PrintTask(middle , end);
			//并行执行两个“小任务”
			left.fork();
			right.fork();
		}
	}
}
public class ForkJoinPoolTest
{
	public static void main(String[] args) throws Exception
	{
		ForkJoinPool pool = new ForkJoinPool();
		//提交可分解的PrintTask任务
		pool.submit(new PrintTask(0 , 300));
		pool.awaitTermination(2 , TimeUnit.SECONDS);
		//关闭线程池
		pool.shutdown();
	}
}