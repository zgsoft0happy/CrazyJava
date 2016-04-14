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
public class CommandTest
{
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {3 , -4 , 6 , 4};
		//第一次处理数组，具体处理行为取决于PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("------------------");
		//第二次处理数组，具体处理行为取决于AddCommand
		pa.process(target, new AddCommand());
	}
}