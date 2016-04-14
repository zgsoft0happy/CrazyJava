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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		String s1 = "疯狂Java";
		//s2变量引用的字符串可以在编译时就确定下来
		//因此引用常量池中已有的"疯狂Java"字符串
		String s2 = "疯狂" + "Java";
		System.out.println(s1 == s2);
		//定义两个字符串直接量
		String str1 = "疯狂";	//1
		String str2 = "java";	//2
		//将str1和str2进行连接运算
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}
}