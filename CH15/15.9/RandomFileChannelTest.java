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
import java.nio.channels.*;
public class RandomFileChannelTest
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("a.txt");
		try(
			//创建一个RandomAccess对象
			RandomAccessFile raf = new RandomAccessFile(f , "rw");
			//获取RandomAccessFile对应的Channel
			FileChannel randomChannel = raf.getChannel())
		{
			//将Channel中的所有数据映射成ByteBuffer
			ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY , 0 ,f.length());
			//把Channel的记录指针移动到最后
			randomChannel.position(f.length());
			//将buffer中的所有数据输出
			randomChannel.write(buffer);
		}
	}
}