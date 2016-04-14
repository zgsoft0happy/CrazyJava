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
public class FinallyFlowTest
{
	public static void main(String[] args) throws Exception
	{
		boolean a = test();
		System.out.println(a);
	}
	public static boolean test()
	{
		try
		{
			//因为finally块中包含了return语句
			//所以下面的return语句失去作用
			return  true;
		}
		finally
		{
			return false;
		}
	}
}