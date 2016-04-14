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
public class MethodLocalVariableTest
{
	public static void main(String[] args)
	{
		//定义一个方法局部变量a
		int a;
		//下面代码将出现错误，因为a变量还未初始化
		//System.out.println("方法和局部变量a的值：" + a);
		//为a变量赋初始值，也就是进行初始化
		a = 5;
		System.out.println("方法局部变量a的值：" +a);
	}
}