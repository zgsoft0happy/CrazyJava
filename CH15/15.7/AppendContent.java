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
public class AppendContent
{
	public static void main(String[] args)
	{
		try(
			//�Զ���д��ʽ��һ��RandomAccessFile����
			RandomAccessFile raf = new RandomAccessFile("out.txt" , "rw"))
		{
			//����¼ָ���ƶ���out.txt�ļ������
			raf.seek(raf.length());
			raf.write("׷�ӵ����ݣ�\r\n".getBytes());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}