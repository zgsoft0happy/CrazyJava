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
public class ReadFile{
	public static void main(String[] args) throws IOException
	{
		try(
			//�����ļ�������
			FileInputStream fis = new FileInputStream("ReadFile.java");
			//����һ��FileChannel
			FileChannel fcin = fis.getChannel())
		{
			//����һ��ByteBuffer���������ظ�ȥ˯
			ByteBuffer bbuff = ByteBuffer.allocate(64);
			//��FileChannel�е����ݷ���ButeBuffer��
			while (fcin.read(bbuff) != -1)
			{
				//����Buffer�Ŀհ���
				bbuff.flip();
				//����Charset����
				Charset charset = Charset.forName("GBK");
				//����������(CharsetDecoder)����
				CharsetDecoder decoder = charset.newDecoder();
				//��ByteBuffer������ת��
				CharBuffer cbuff = decoder.decode(bbuff);
				System.out.println(cbuff);
				//��Buffer��ʼ����Ϊ��һ�ζ�ȡ������׼��
				bbuff.clear();
			}
		}
	}
}