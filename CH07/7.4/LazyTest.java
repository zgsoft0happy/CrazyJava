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
import java.util.Calendar;
import static java.util.Calendar.*;
public class LazyTest
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);		//2003-8-31
		//将月份设为9，但9月31日不存在
		//如果立即修改，系统将会把cal自动调整到10月1日
		cal.set(MONTH , 8);
		//下面代码输出10月1日
		//System.out.println(cal.getTime());	//1
		//设置DATE字段为5
		cal.set(DATE , 5);		//2
		System.out.println(cal.getTime());		//3
	}
}