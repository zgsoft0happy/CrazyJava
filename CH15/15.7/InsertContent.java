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
public class InsertContent
{
	public static void insert(String fileName , long pos , String insertContent) throws IOException
	{
		File tmp = File.createTempFile("tmp" , null);
		tmp.deleteOnExit();
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName , "rw");
			//ʹ����ʱ�ļ�����������������
			FileOutputStream tmpOut = new FileOutputStream(tmp);
			FileInputStream tmpIn = new FileInputStream(tmp))
		{
			raf.seek(pos);
			//----������뽫����������ݶ�����ʱ�ļ��б���----
			byte[] bbuf = new byte[64];
			//���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			//ʹ��ѭ����ʽ��ȡ�����������
			while ((hasRead = raf.read(bbuf)) > 0)
			{
				//����ȡ������д����ʱ�ļ�
				tmpOut.write(bbuf , 0 , hasRead);
			}
			//----����������ڲ�������-----
			//���ļ���¼ָ�����¶�λ��posλ��
			raf.seek(pos);
			//׷����Ҫ���������
			raf.write(insertContent.getBytes());
			//׷����ʱ�ļ��е�����
			while ((hasRead = tmpIn.read(bbuf)) > 0)
			{
				raf.write(bbuf , 0 , hasRead);
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		insert("InsertContent.java" , 45 , "���������\r\n");
	}
}