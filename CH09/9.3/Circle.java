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
//定义Shape的子类Circle
public class Circle extends Shape
{
	//实现画图方法，以打印字符串来模拟画图方法实现
	public void draw(Canvas c)
	{
		System.out.println("在画布" + c + "上画一个圆");
	}
}