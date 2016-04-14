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
public class IfTest
{
	public static void main(String[] args)
	{
		int age = 30;
		if(age > 20)
		//只有当age > 20时，下面花括号括起来的代码块才会执行
		//花括号括起来的语句是一个整体，要么一起执行，要么一起不执行
		{
			System.out.println("年龄已经大于20岁了");
			System.out.println("20岁以上的人应该学会承担责任……");
		}
		
		
		//定义变量a，并为其赋值
		int a = 5;
		if(a > 4)
			//如果a > 4，则执行限免的执行体，只有一行代码作为代码块
			System.out.println("a大于4");
		else
			//否则，执行线面的执行体，只有一行代码作为代码块
			System.out.println("a不大于4");
			
		
		//定义变量b，并为其赋值
		int b = 5;
		if(b > 4)
			//如果b > 4，则执行下面的执行体，只有一行代码作为代码块
			System.out.println("b大于4");
		else 
			//否则，执行下面的执行体，只有一行代码作为代码块
			b--;
			//对于下面的代码而言，它已经不再是条件执行的一部分，因此总会执行
			System.out.println("b不大于4");
			
		
		//定义变量c，并为其赋值
		int c = 5;
		if(c > 4)
			//如果c > 4，则执行下面的执行体，将只有c--;一行代码为执行体
			c--;
			//下面是一行普通代码，不属于执行体
			//System.out.println("c大于4");
		//此处的else将没有if语句，因此编译出错
		else
			//否则，执行下面的执行体，只有一行代码作为代码块	
			System.out.println("c不大于4");
	}
}