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
public class Primitive2String
{
	public static void main(String[] args)
	{
		String intStr = "123";
		//把一个特定字符串转换成int变量
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it2);
		String floatStr = "4.56";
		//把一个特定的字符串转换成float变量
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);
		//把一个float变量转换成String变量
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		//把一个double变量转换成String变量
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		//把一个boolean变量转换成String 变量
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}