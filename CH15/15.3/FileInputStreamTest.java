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
public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		//�����ֽ�������
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
		//����һ������Ϊ1024��"��Ͳ"
		byte[] bbuf = new byte[1024];
		//���ڱ����Ƕ�ȡ���ֽ���
		int hasRead = 0 ;
		//ʹ��ѭ�����ظ�"ȡˮ"����
		while ((hasRead = fis.read(bbuf)) > 0)
		{
			//ȡ��"��Ͳ"�е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ�������
			System.out.println(new String(bbuf , 0 , hasRead));
		}
		//�ر��ļ�������������finally�������ȫ
		fis.close();
	}
}