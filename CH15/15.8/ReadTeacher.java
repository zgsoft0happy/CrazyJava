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
public class ReadTeacher
{
	public static void main(String[] args)
	{
		try(
			//创建一个ObjectInputStream输入流
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt")))
		{
			//依次读取ObjectInputStream输入流中的4个对象
			Teacher t1 = (Teacher)ois.readObject();
			Teacher t2 = (Teacher)ois.readObject();
			Person p = (Person)ois.readObject();
			Teacher t3 = (Teacher)ois.readObject();
			//输出true
			System.out.println("t1的student引用和[是否相同：" + (t1.getStudent() == p));
			//输出true
			System.out.println("t2的student引用和p是否相同：" + (t2.getStudent() == p));
			//输出true
			System.out.println("t2和t3是否是同一个对象：" + (t2 == t3));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}