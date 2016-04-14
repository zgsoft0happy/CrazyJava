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
import static java.util.Calendar.*;
import java.util.Calendar;
public class LenientTest
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		//结果是YEAR字段加1，MONTH字段为1（2月）
		cal.set(MONTH,13);		//1
		System.out.println(cal.getTime());
		//关闭容错性
		cal.setLenient(false);
		//导致运行时异常
		cal.set(MONTH,13);		//2
		System.out.println(cal.getTime());
	}
}