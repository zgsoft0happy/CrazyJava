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
import java.io.*;
public class OverrideThrows
{
	public void test() throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class sub extends OverrideThrows
{
	//子类方法声明抛出了比父类更大的异常 
	//所以下面方法出错
	public void test() throws Exception
	{}
}