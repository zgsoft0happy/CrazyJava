/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-05  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
public class RedirectOut
{
	public static void main(String[] args)
	{
		try(
			//һ���Դ���PrintStream�����
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt")))
		{
			//����׼����ض���ps�����
			System.setOut(ps);
			//���׼������һ���ַ���
			System.out.println("��ͨ�ַ���");
			//���׼������һ������
			System.out.println(new RedirectOut());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}