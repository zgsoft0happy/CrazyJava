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
class Out
{
	//定义一个内部类，不适用访问控制符
	//即只有同一个包中的其他类可以访问该内部类
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}
public class CreateInnerInstance
{
	public static void main(String[] args)
	{
		Out.In in = new Out().new In("测试消息");
		/*
		上面代码可改为如下三行代码：
		使用OutterClass.InnerClass的形式定义内部类变量
		Out.In in;
		创建外部类实例，非静态内部类实例将寄存在该实例中
		Out out = new Out();
		通过外部类实例和new来调用内部类构造器创建非静态内部类实例
		in = out.new In("测试信息");
		*/
	}
}