/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
import java.nio.*;
import java.nio.charset.*;
public class CharsetTransform
{
	public static void main(String[] args) throws Exception
	{
		//创建简体中文对应的Charset
		Charset cn = Charset.forName("GBK");
		//获取cn对象对应的编码器和解码器
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();//创建一个CharBuffer对象
		CharBuffer cbuff = CharBuffer.allocate(8);
		cbuff.put('孙');
		cbuff.put('悟');
		cbuff.put('空');
		cbuff.flip();
		//将CharBuffer中的字符串序列转换成字节序列
		ByteBuffer bbuff = cnEncoder.encode(cbuff);
		//循环访问ByteBuffer中的每个字节
		for (int i = 0 ; i < bbuff.capacity() ; i++)
		{
			System.out.print(bbuff.get(i) + " ");
		}
		//将ByteBuffer的数据解码成字符序列
		System.out.println("\n" + cnDecoder.decode(bbuff));
	}
}