/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.lang.annotation.*;
public class MyTest
{
	//ʹ��@Testable���ע��ָ���÷����ǿɲ��Ե�
	@Testable
	public static void m1()
	{}
	public static void m2()
	{}
	@Testable
	public static void m3()
	{
		throw new RuntimeException("Boom");
	}
	public static void m4()
	{}
	@Testable
	public static void m5()
	{}
	public static void m6()
	{}
	@Testable
	public static void m7()
	{
		throw new RuntimeException("Crash");
	}
	public static void m8()
	{}	
}