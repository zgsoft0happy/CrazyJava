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
public class ThisInConstructor
{
	//定义一个名为foo的Field
	public int foo;
	public ThisInConstructor()
	{
		//在构造器里定义一个foo变量
		int foo = 0;
		//使用this代表此构造器进行初始化的对象
		//下面的代码将会把刚创建的对象的foo Field设置为6
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		//所有使用ThisInConstructor创建的对象的foo Field
		//都将被设为6，所以下面代码将输出6
		System.out.println(new ThisInConstructor().foo);
	}
}