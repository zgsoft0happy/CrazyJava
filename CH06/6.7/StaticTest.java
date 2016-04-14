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
public class StaticTest
{
	//定义一个非静态内部类，是一个空类
	private class In{}
	//外部类的静态方法
	public static void main(String[] args)
	{
		//下面代码引发编译异常，因为静态成员（main方法）
		//无法访问非晶态成员（in类）
		new In();
	}
}