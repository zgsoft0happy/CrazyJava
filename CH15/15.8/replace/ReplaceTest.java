/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
import java.util.*;
public class ReplaceTest
{
	public static void main(String[] args)
	{
		try(
			//����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
			//����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("replace.txt")))
		{
			Person per = new Person("�����" , 500);
			//ϵͳ��per����ת�����ֽ����в����
			oos.writeObject(per);
			//�����л���ȡ�õ�����ArrayList
			ArrayList list = (ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}