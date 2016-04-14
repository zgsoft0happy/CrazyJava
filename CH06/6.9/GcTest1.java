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
public class GcTest1
{
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 4 ; i++)
		{
			new GcTest1();
			//下面两行代码的作用完全相同，强制系统进行垃圾回收
			//System.gc();
			Runtime.getRuntime().gc();
		}
	}
	public void finalize()
	{
		System.out.println("系统正在清理GcTest对象的资源...");
	}
}