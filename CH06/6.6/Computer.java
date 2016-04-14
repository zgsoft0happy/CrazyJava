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
public class Computer
{
	private Output out;
	public Computer(Output out)
	{
		this.out = out;
	}
	//定义一个莫宁获取字符串输入的方法
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	//定义一个模拟打印的方法
	public void print()
	{
		out.out();
	}
}