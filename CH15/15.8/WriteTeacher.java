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
public class WriteTeacher
{
	public static void main(String[] args)
	{
		try(
			//创建一个ObjectOutputStream输出流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt")))
		{
			Person per = new Person("孙悟空" , 500);
			Teacher t1 = new Teacher("唐僧" , per);
			Teacher t2 = new Teacher("菩提祖师" , per);
			//依次将四个对象写入输出流
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}