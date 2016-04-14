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
public class StringBuilderTest
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		//追加字符串
		sb.append("java");		//sb = "Java"
		//插入
		sb.insert(0 , "hello "); //sb = "hello Java"
		//替换
		sb.replace(5 , 6 , ",");		//sb = "hello,java"
		//删除
		sb.delete(5 , 6);		//sb = "hellojava"
		System.out.println(sb);
		//反转
		sb.reverse();	//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());	//输出9
		System.out.println(sb.capacity());	//输出16
		//改变StringBuilder的长度，只保留前面部分
		sb.setLength(5);		//sb = "avajo"
		System.out.println(sb);
	}
}