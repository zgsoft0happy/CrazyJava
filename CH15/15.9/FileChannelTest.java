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
import java.nio.charset.*;
public class FileChannelTest
{
	public static void main(String[] args)
	{
		File f = new File("FileChannelTest.java");
		try(
			//����FileInputStream���Ը��ļ�����������FileChannel
			FileChannel inChannel = new FileInputStream(f).getChannel();
			//���ļ����������FileChannel�����Կ������
			FileChannel outChannel = new FileOutputStream("a.txt").getChannel())
		{
			//��FileChannel���ȫ������ӳ���ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY , 0 , f.length()); 	//1
			//ʹ��GBK���ַ���������������
			Charset charset = Charset.forName("GBK");
			//ֱ�ӽ�buffer�������ȫ�����
			outChannel.write(buffer);		//2
			//�ٴε���buffer��clear()��������ԭlimit��position��λ��
			buffer.clear();
			//����������(CharsetDecoder)����
			CharsetDecoder decoder = charset.newDecoder();
			//ʹ�ý�������ByteBufferת����CharBuffer
			CharBuffer charBuffer = decoder.decode(buffer);
			//CharBuffer��toString�������Ի�ȡ��Ӧ���ַ���
			System.out.println(charBuffer);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}