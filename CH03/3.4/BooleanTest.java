/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class BooleanTest
{
	public static void main(String[]args)
	{
		//定义b1的值为true
		boolean b1 = true;
		//定义b2的值为false
		boolean b2 = false;
		
		
		//使用boolean类型的值和字符串进行连接运算，boolean类型的值会自动转换成字符串
		String str = true + "";
		//下面将输出true
		System.out.println(str);
	}
}