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
public class RuntimeTest
{
	public static void main(String[] args)
	{
		//获取Java程序关联的运行时对象
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量：" + rt.availableProcessors());
		System.out.println("空闲内存数：" + rt.freeMemory());
		System.out.println("内存总数：" + rt.totalMemory());
		System.out.println("可用最大内存数：" + rt.maxMemory());
	}
}