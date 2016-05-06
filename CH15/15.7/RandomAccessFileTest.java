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
public class RandomAccessFileTest
{
	public static void main(String[] args)
	{
		try(
			RandomAccessFile raf = new RandomAccessFile("RandomAccessFileTest.java" , "r"))
		{
			//��ȡRandomAccessFile�����ļ�ָ���λ�ã���ʼλ����0
			System.out.println("RandomAccessFile���ļ�ָ��ĳ�ʼλ�ã�" + raf.getFilePointer());
			//�ƶ�raf���ļ���¼ָ���λ��
			raf.seek(300);
			byte[] buff = new byte[1024];
			//���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			//ʹ��ѭ�����ظ�"ȡˮ"����
			while ((hasRead = raf.read(buff)) > 0)
			{
				//ȡ��"��Ͳ"�е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ�������
				System.out.println(new String(buff , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}