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
import java.util.Stack;
public class VectorTest
{
	public static void main(String[] args)
	{
		Stack v = new Stack();
		//依次将三个元素"push"入栈
		v.push("疯狂Java讲义");
		v.push("轻量级Java EE企业应用实战");
		v.push("疯狂Android讲义");
		//输出：[疯狂Java讲义，轻量级Java EE企业应用实战，疯狂Android讲义]
		System.out.println(v);
		//访问第一个元素，但并不将其"pop"出栈，输出：疯狂Android讲义
		System.out.println(v.peek());
		//依次输出：[疯狂Java讲义，轻量级Java EE企业应用实战，疯狂Android讲义]
		System.out.println(v);
		//"pop"出栈第一个元素，输出：疯狂Android讲义
		System.out.println(v.pop());
		//输出：[疯狂Java讲义，轻量级Java EE企业应用实战]
		System.out.println(v);
	}
}