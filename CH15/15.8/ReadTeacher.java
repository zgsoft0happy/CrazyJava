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
public class ReadTeacher
{
	public static void main(String[] args)
	{
		try(
			//����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt")))
		{
			//���ζ�ȡObjectInputStream�������е�4������
			Teacher t1 = (Teacher)ois.readObject();
			Teacher t2 = (Teacher)ois.readObject();
			Person p = (Person)ois.readObject();
			Teacher t3 = (Teacher)ois.readObject();
			//���true
			System.out.println("t1��student���ú�[�Ƿ���ͬ��" + (t1.getStudent() == p));
			//���true
			System.out.println("t2��student���ú�p�Ƿ���ͬ��" + (t2.getStudent() == p));
			//���true
			System.out.println("t2��t3�Ƿ���ͬһ������" + (t2 == t3));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}