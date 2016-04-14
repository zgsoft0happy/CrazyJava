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
public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("只有一个字符串参数的test方法");
	}
	//因为前面已经有了一个test方法，test方法里有一个字符串参数
	//此处的长度可变形参历不包含一个字符串参数的形式
	public void test(String...books)
	{
		System.out.println("****形参长度可变的test方法****");
	}
	public static void main(String[] args)
	{
		OverloadVarargs olv = new OverloadVarargs();
		//下面两次调用将执行第二个test方法
		olv.test();
		olv.test("aa","bb");
		//下面调用将执行第一个test方法
		olv.test("aa");
		//下面调用将执行第二个test方法
		olv.test(new String[]{"aa"});
	}
}