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
public class ArgsTest
{
	public static void main(String[] args)
	{
		//输出args数组的长度
		System.out.println(args.length);
		//便利args数组的每个元素
		for (String arg : args)
		{
			System.out.println(arg);
		}
	}
}