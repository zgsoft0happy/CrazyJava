/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-06  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
public class ReadObject
{
	public static void main(String[] args)
	{
		try(
			//����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
		{
			//���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person p = (Person)ois.readObject();
			System.out.println("����Ϊ��" + p.getName() +"\n����Ϊ��" + p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}