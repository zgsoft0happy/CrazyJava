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
class MyClass<E>
{
	public <T> MyClass(T t)
	{
		System.out.println("t参数的值为：" + t);
	}
}
public class GenericDiamondTest
{
	public static void main(String[] args)
	{
		//MyClass类声明中的E形参是String类型
		//泛型构造器中声明的T形参是Integer类型
		MyClass<String> mc1 = new MyClass<>(5);
		//显式指定泛型构造器中声明的T形参是Integer类型
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		//MyClass类声明中的E形参是String类型
		//如果显式指定泛型构造器中声明的T形参是Integer类型
		//此时就不能使用"菱形"语法，下面代码是错的
		//MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}