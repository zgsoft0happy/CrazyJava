/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-04  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class FilenameFilterTest
{
	public static void main(String[] args)
	{
		File file = new File(".");
		String[] nameList = file.list(new MyFilenameFilter());
		for (String name : nameList)
		{
			System.out.println(name);
		}
	}
}
//实现自己的FilenameFilter实现类
class MyFilenameFilter implements FilenameFilter
{
	public boolean accept(File dir , String name)
	{
		//如果文件名以.java结尾，或者文件对应一个路径，则返回true
		return name.endsWith(".java") || new File(name).isDirectory();
	}
}