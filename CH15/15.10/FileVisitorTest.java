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
import java.nio.file.*;
import java.nio.file.attribute.*;
public class FileVisitorTest
{
	public static void main(String[] args) throws Exception
	{
		//����E:\Java\CrazyJava\Java\CH15Ŀ¼д�������ļ�����Ŀ¼
		Files.walkFileTree(Paths.get("E:" , "Java" , "CrazyJava" , "Java" , "CH15") , new SimpleFileVisitor<Path>()
		{
			//���ʸ��ļ�ʱ�����÷���
			@Override
			public FileVisitResult visitFile(Path file , BasicFileAttributes attrs) throws IOException
			{
				System.out.println("���ڷ���" + file + "�ļ�");
				//�ҵ���FileVisitorTest.java�ļ�
				if (file.endsWith("FileVisitorTest.java"))
				{
					System.out.println("--�Ѿ��ҵ�Ŀ���ļ�--");
					return FileVisitResult.TERMINATE;
				}
				return FileVisitResult.CONTINUE;
			}
			//��ʼ����Ŀ¼ʱ�����÷���
			@Override
			public FileVisitResult preVisitDirectory(Path dir , BasicFileAttributes attrs) throws IOException
			{
				System.out.println("���ڷ��ʣ� " + dir + "·��");
				return FileVisitResult.CONTINUE;
			}
		});
	}
}