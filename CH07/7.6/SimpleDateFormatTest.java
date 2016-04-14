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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class SimpleDateFormatTest
{
	public static void main(String[] args) throws ParseException
	{
		Date d = new Date();
		//创建一个SimpleDateFormat对象
		SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy年中第D天");
		//将d格式化成日期，输出：公园2007年中第354天
		String dateStr = sdf1.format(d);
		System.out.println(dateStr);
		//一个非常特殊的日期字符串
		String str = "07###三月##21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
		//将日期字符串解析成日期，输出：Wed Mar 21 00:00:00 CST 2007
		System.out.println(sdf2.parse(str));
	}
}