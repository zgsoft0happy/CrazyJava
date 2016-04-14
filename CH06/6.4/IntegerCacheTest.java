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
public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		//生成新的Integer对象
		Integer in1 = new Integer(6);
		//生成新的Integer对象，并缓存该对象
		Integer in2 = Integer.valueOf(6);
		//直接从缓存中取出Integer对象
		Integer in3 = Integer.valueOf(6);
		//输出false
		System.out.println(in1 == in2);
		//输出true
		System.out.println(in2 == in3);
		//由于Integer只缓存-128~127之间的值
		//因此200对应的Integer对象没有被缓存
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5);	//输出false
		
	}
}