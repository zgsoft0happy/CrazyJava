/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-04  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try(
			//�����ֽ�������
			FileInputStream fis = new FileInputStream("FileOutputSTreamTest.java");
			//�����ֽ������
			FileOutputStream fos = new FileOutputStream("newFile.txt"))
		{
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			//ѭ������������ȡ������
			while ((hasRead = fis.read(bbuf)) > 0)
			{
				//ÿ��ȡ���Σ���д���ļ�����������˶��٣���д����
				fos.write(bbuf , 0 , hasRead);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}