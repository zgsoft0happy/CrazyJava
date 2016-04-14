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
public class InstanceInitTest
{
	//限制性初始化块将a Field赋值为6
	{
		a = 6;
	}
	//再执行将a Field赋值为9
	int a = 9;
	public static void main(String[] args)
	{
		//下面代码将输出9
		System.out.println(new InstanceInitTest().a);
	}
}