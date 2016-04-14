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
//定义一个Product接口
interface Product
{
	int getProduceTime();
}
//让Printer类实现Output接口和Product接口
public class Printer implements Output , Product
{
	private String[] printData = new String[MAX_CACHE_LINE];
	//用以记录当前需打印的作业数
	private int dataNum = 0;
	public void out()
	{
		//只要还有作业，就继续打印
		while(dataNum > 0)
		{
			System.out.println("打印机打印：" + printData[0]);
			//把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData , 1 , printData , 0 , --dataNum);
			
		}
	}
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("输出队列已满，添加失败");
		}
		else
		{
			//把打印数据添加到队列里，已保存数据的数量加1
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		//创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("轻量级Java EE企业应用实战");
		o.getData("疯狂Java讲义");
		o.out();
		o.getData("疯狂Android讲义");
		o.getData("疯狂Ajax讲义");
		o.out();
		//创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量可直接赋给Object类型的变量
		Object obj = p;
	}
}