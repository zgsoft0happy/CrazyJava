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
import java.nio.charset.*;
public class CharsetTransform
{
	public static void main(String[] args) throws Exception
	{
		//�����������Ķ�Ӧ��Charset
		Charset cn = Charset.forName("GBK");
		//��ȡcn�����Ӧ�ı������ͽ�����
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();//����һ��CharBuffer����
		CharBuffer cbuff = CharBuffer.allocate(8);
		cbuff.put('��');
		cbuff.put('��');
		cbuff.put('��');
		cbuff.flip();
		//��CharBuffer�е��ַ�������ת�����ֽ�����
		ByteBuffer bbuff = cnEncoder.encode(cbuff);
		//ѭ������ByteBuffer�е�ÿ���ֽ�
		for (int i = 0 ; i < bbuff.capacity() ; i++)
		{
			System.out.print(bbuff.get(i) + " ");
		}
		//��ByteBuffer�����ݽ�����ַ�����
		System.out.println("\n" + cnDecoder.decode(bbuff));
	}
}