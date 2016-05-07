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
public class FileLockTest
{
	public static void main(String[] args) throws Exception
	{
		try(
			//使用FileOutputStream获取FileChannel
			FileChannel channel = new FileOutputStream("a.txt").getChannel())
		{
			//使用非阻塞式方式对指定文件加锁
			FileLock lock = channel.tryLock();
			//程序暂停10s
			Thread.sleep(10000);
			//释放锁
			lock.release();
		}
	}
}