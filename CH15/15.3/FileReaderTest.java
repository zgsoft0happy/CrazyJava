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
public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
		try(
			//�����ַ�������
			FileReader fr = new FileReader("FileReaderTest.java"))
		{
			//����һ������Ϊ32��"��Ͳ"
			char[] cbuf = new char[32];
			//���ڱ���ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			//ʹ��ѭ�����ظ���ȡˮ������
			while ((hasRead = fr.read(cbuf)) > 0)
			{
				//ȡ������Ͳ���е�ˮ�Σ��ַ��������ַ�����ת�����ַ������룡
				System.out.print(new String(cbuf , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}