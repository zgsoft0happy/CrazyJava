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
import java.nio.*;
import java.nio.channels.*;
public class FileLockTest
{
	public static void main(String[] args) throws Exception
	{
		try(
			//ʹ��FileOutputStream��ȡFileChannel
			FileChannel channel = new FileOutputStream("a.txt").getChannel())
		{
			//ʹ�÷�����ʽ��ʽ��ָ���ļ�����
			FileLock lock = channel.tryLock();
			//������ͣ10s
			Thread.sleep(10000);
			//�ͷ���
			lock.release();
		}
	}
}