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
import java.util.Scanner;
public class ScannerKeyBoardTest
{
	public static void main(String[] args)
	{
		//System.in代表标准输入，就是键盘输入
		Scanner sc = new Scanner(System.in);
		//增加下面一行将只把回车作为分隔符
		//sc.useDelimiter("\n");
		//判断是否还有下一项
		while (sc.hasNext())
		{
			//输出输入项
			System.out.println("键盘输入的内容是：" + sc.next());
		}
	}
}