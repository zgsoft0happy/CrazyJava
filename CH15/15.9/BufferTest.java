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
public class BufferTest
{
	public static void main(String[] args)
	{
		//����Buffer
		CharBuffer buff = CharBuffer.allocate(8);		//1
		System.out.println("capacity: " + buff.capacity());
		System.out.println("limit: " + buff.limit());
		System.out.println("position: " + buff.position());
		//����Ԫ��
		buff.put('a');
		buff.put('b');
		buff.put('c');	//2
		System.out.println("��������Ԫ�غ�position = " + buff.position());
		//����flip()����
		buff.flip();		//3
		System.out.println("ִ��flip()��limit = " + buff.limit());
		System.out.println("position = " + buff.position());
		//ȡ����һ��Ԫ��
		System.out.println("��һ��Ԫ��(position=0): " + buff.get());	//4
		System.out.println("ȡ��һ��Ԫ�غ�position = " + buff.position());
		//����clear()����
		buff.clear();		//5
		System.out.println("ִ��clear()��limit = " + buff.limit());
		System.out.println("ִ��clear()��position = " + buff.position());
		System.out.println("ִ��clear()�󣬻��������ݲ�û�б������" + "������Ԫ��Ϊ��" + buff.get(2));	//6
		System.out.println("ִ�о��Զ�ȡ��position = " + buff.position());
	}
}