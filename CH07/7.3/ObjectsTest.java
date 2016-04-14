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
import java.util.Objects;
public class ObjectsTest
{
	//定义一个obj变量，它的默认值是null
	static ObjectsTest obj;
	public static void main(String[] args)
	{
		//输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString，输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，如果obj为null则引发异常
		System.out.println(Objects.requireNonNull(obj , "obj参数不能是null!"));
	}
}