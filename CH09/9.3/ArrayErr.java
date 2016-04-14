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
public class ArrayErr
{
	public static void main(String[] args)
	{
		//定义一个Integer数组
		Integer[] ia = new Integer[5];
		//可以把一个Integer[]数组赋给Number[]变量
		Number[] na = ia;
		//下面代码编译正常，但运行时会引发ArrayStoreException异常
		//因为0.5并不是Integer
		na[0] = 0.5;
	}
}