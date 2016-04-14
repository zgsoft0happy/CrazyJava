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
package lee;
//使用import导入lee.sub.Apple类
import lee.sub.Apple;
public class HelloTest
{
	public static void main(String[] args)
	{
		//直接访问相同包下的另一个类，无需使用包前缀
		Hello h = new Hello();
		//使用类全名的写法
		lee.sub.Apple a = new lee.sub.Apple();
		//如果使用import语句来导入Apple类，就可以不再使用全类名了
		Apple aa = new Apple();
	}
}