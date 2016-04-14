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
public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		//return this，返回调用该方法的对象
		return this;
	}
	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		//可以连续调用同一个方法
		rt.grow()
			.grow()
			.grow();
		System.out.println("rt的age Field值是：" + rt.age);
	}
}