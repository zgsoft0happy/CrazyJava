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
public class RandomStr
{
	public static void main(String[] args)
	{
		//定义一个空字符串
		String result = "";
		//进行6次循环
		for(int i = 0 ; i < 6 ; i++)
		{
			//生曾一个97~122之间的int类型整数
			int intValue = (int)(Math.random() * 26 + 97);
			//将intValue强制转换为char类型后连接到result后面
			result = result + (char)intValue;
		}
		//输出随机字符串
		System.out.println(result);
	}
}