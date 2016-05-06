/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-06  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class WriteObject
{
	public static void main(String[] args)
	{
		try(
			//创建一个ObjectOutputStream输出流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			Person per = new Person("孙悟空" , 500);
			//将per对象写入输出流
			oos.writeObject(per);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}