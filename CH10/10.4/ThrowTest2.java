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
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class ThrowTest2
{
	public static void main(String[] args)
		//Java 6认为1号代码可能抛出Exception异常
		//所以此处生命抛出Exception异常
		//throws Exception
		throws FileNotFoundException
	{
		try
		{
			new FileOutputStream("a.txt");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;		//1
		}
	}
}