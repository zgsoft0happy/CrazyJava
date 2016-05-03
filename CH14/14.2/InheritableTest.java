/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.lang.annotation.*;
//使用@Inheritable修饰的Base类
@Inheritable
class Base
{}
//InheritableTest类只是继承了Base类
//并未直接使用@Inheritable Annotation修饰
public class InheritableTest extends Base
{
	public static void main(String[] args)
	{
		//打印InheritableTest类是否有@Inheritable修饰
		System.out.println(InheritableTest.class.isAnnotationPresent(Inheritable.class));
	}
}