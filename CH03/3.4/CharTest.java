/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
 public class CharTest
 {
	 public static void main(String[] args)
	 {
		 //直接指定单个字符作为字符类型常量
		 char aChar = 'a';
		 //使用转义字符来作为字符类型常量
		 char enterChar = '\r';
		 //使用Unicode编码值来指定字符类型常量
		 char ch = '\u9999';
		 //将输出一个'香'字符
		 System.out.println(ch);
		 //定义一个'疯’字符类型常量
		 char zhong = '疯';
		 //直接将一个char类型变量当成int类型变量使用
		 int zhongValue = zhong;
		 System.out.println(zhongValue);
		 //直接把0·65535范围内的一个int整数付给一个char类型变量
		 char c = 97;
		 System.out.println(c);
		 
		 
		 //下面代码定义一个s变量，它是一个字符串实例的引用，是一个引用类型的变量
		 String  s = "沧海月明珠有泪，蓝田玉暖日生烟。";
	 }
 }