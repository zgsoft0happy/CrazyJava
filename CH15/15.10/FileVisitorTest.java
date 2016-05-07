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
import java.nio.file.attribute.*;
public class FileVisitorTest
{
	public static void main(String[] args) throws Exception
	{
		//遍历E:\Java\CrazyJava\Java\CH15目录写的所有文件个子目录
		Files.walkFileTree(Paths.get("E:" , "Java" , "CrazyJava" , "Java" , "CH15") , new SimpleFileVisitor<Path>()
		{
			//访问该文件时触发该方法
			@Override
			public FileVisitResult visitFile(Path file , BasicFileAttributes attrs) throws IOException
			{
				System.out.println("正在访问" + file + "文件");
				//找到了FileVisitorTest.java文件
				if (file.endsWith("FileVisitorTest.java"))
				{
					System.out.println("--已经找到目标文件--");
					return FileVisitResult.TERMINATE;
				}
				return FileVisitResult.CONTINUE;
			}
			//开始访问目录时触发该方法
			@Override
			public FileVisitResult preVisitDirectory(Path dir , BasicFileAttributes attrs) throws IOException
			{
				System.out.println("正在访问： " + dir + "路径");
				return FileVisitResult.CONTINUE;
			}
		});
	}
}