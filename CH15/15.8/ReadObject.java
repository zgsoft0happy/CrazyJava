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
public class ReadObject
{
	public static void main(String[] args)
	{
		try(
			//创建一个ObjectInputStream输入流
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
		{
			//从输入流中读取一个Java对象，并将其强制类型转换为Person类
			Person p = (Person)ois.readObject();
			System.out.println("名字为：" + p.getName() +"\n年龄为：" + p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}