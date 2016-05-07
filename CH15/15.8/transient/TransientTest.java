/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class TransientTest
{
	public static void main(String[] args)
	{
		try(
			//创建一个ObjectOutputStream输出流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
			//创建一个ObjectInputStream输入流
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt")))
		{
			Person per = new Person("孙悟空" , 500);
			//系统将per对象转换成字节序列并输出
			oos.writeObject(per);
			Person p = (Person)ois.readObject();
			System.out.println(p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}