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
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StartEnd
{
	public static void main(String[] args)
	{
		//创建一个Pattern对象，并用它建立一个Matcher对象
		String regStr = "Java is very easy!";
		System.out.println("目标字符串是：" + regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find())
		{
			System.out.println(m.group() + "子串的起始位置："
				+ m.start() + "，其结束位置：" + m.end());
		}
	}
}