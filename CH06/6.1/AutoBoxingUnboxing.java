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
public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		//直接把一个基本类型变量赋给Integer对象
		Integer inObj = 5;
		//直接把一个boolean类型变量赋给一个Object类型变量
		Object boolObj = true;
		int it = inObj;
		if (boolObj instanceof Boolean)
		{
			//先把Object对象强制类型转换为Boolean类型，再赋给boolean变量
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}
}