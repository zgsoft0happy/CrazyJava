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
public class WriteTeacher
{
	public static void main(String[] args)
	{
		try(
			//����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt")))
		{
			Person per = new Person("�����" , 500);
			Teacher t1 = new Teacher("��ɮ" , per);
			Teacher t2 = new Teacher("������ʦ" , per);
			//���ν��ĸ�����д�������
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