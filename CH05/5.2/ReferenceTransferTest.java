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
class DataWrap
{
	public int a;
	public int b;
}
public class ReferenceTransferTest
{
	public static void swap(DataWrap dw)
	{
		//下面三行代码实现dw的a、b两个Field值交换
		//定义一个临时变量来保存dw对象的a Field的值
		int tmp = dw.a;
		//把dw对象的b Field的值赋给a Field
		dw.a = dw.b;
		//把临时变量tmp的值赋给dw对象的b Field
		dw.b = tmp;
		System.out.println("swap方法里，a Field的值是" + dw.a + "；b Field的值是" + dw.b);
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，a Field的值是" + dw.a + "；b Field的值是" + dw.b);
	}
}