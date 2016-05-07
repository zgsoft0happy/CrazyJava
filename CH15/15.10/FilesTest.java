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
import java.nio.charset.*;
import java.util.*;
public class FilesTest
{
	public static void main(String[] args) throws Exception
	{
		//复制文件
		Files.copy(Paths.get("FilesTest.java") , new FileOutputStream("a.txt"));
		//判断FilesTest.java是否是隐藏文件
		System.out.println("FileTest.java是否是隐藏文件：" + Files.isHidden(Paths.get("FilesTest.java")));
		//一次性读取FilesTest.java文件的所有行
		List<String> lines = Files.readAllLines(Paths.get("FilesTest.java") , Charset.forName("gbk"));
		System.out.println(lines);
		System.out.println("FilesTest.java的大小为：" + Files.size(Paths.get("FilesTest.java")));
		List<String> poem = new ArrayList<>();
		poem.add("水晶潭底银鱼跃");
		poem.add("清徐风中碧竿横");
		//直接将多个字符串内容写入指定文件中
		Files.write(Paths.get("poem.txt") , poem , Charset.forName("gbk"));
		FileStore cStore = Files.getFileStore(Paths.get("C:"));
		//判断C盘的总空间、可用空间
		System.out.println("C:共有空间：" + cStore.getTotalSpace());
		System.out.println("C:可用空间：" + cStore.getUsableSpace());
	}
}