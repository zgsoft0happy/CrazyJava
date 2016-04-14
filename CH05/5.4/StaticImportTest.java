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
import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImportTest
{
	public static void main(String[] args)
	{
		//out是java.lang.System类的静态Field，代表标准输出
		//PI是java.lang.Math类的静态Field，表示π常量
		out.println(PI);
		//直接调用Math类的sqrt静态方法
		out.println(sqrt(256));
	}
}