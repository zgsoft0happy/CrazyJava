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
import java.nio.file.*;
public class WatchServiceTest
{
	public static void main(String[] args) throws Exception
	{
		//获取文件系统的WatchService对象
		WatchService watchService = FileSystems.getDefault().newWatchService();
		//为C:盘根路径注册监听
		Paths.get("C:/").register(watchService , StandardWatchEventKinds.ENTRY_CREATE ,
			StandardWatchEventKinds.ENTRY_MODIFY , StandardWatchEventKinds.ENTRY_DELETE);
		while (true)
		{
			//获取下一个文件变化事件
			WatchKey key = watchService.take();		//1
			for (WatchEvent<?> event : key.pollEvents())
			{
				System.out.println(event.context() + "文件发生了" + event.kind() + "事件！");
			}
			//重设WatchKey
			boolean valid = key.reset();
			//如果重设失败，退出监听
			if (!valid)
			{
				break;
			}
		}
	}
}