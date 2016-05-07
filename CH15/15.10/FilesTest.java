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
import java.nio.charset.*;
import java.util.*;
public class FilesTest
{
	public static void main(String[] args) throws Exception
	{
		//�����ļ�
		Files.copy(Paths.get("FilesTest.java") , new FileOutputStream("a.txt"));
		//�ж�FilesTest.java�Ƿ��������ļ�
		System.out.println("FileTest.java�Ƿ��������ļ���" + Files.isHidden(Paths.get("FilesTest.java")));
		//һ���Զ�ȡFilesTest.java�ļ���������
		List<String> lines = Files.readAllLines(Paths.get("FilesTest.java") , Charset.forName("gbk"));
		System.out.println(lines);
		System.out.println("FilesTest.java�Ĵ�СΪ��" + Files.size(Paths.get("FilesTest.java")));
		List<String> poem = new ArrayList<>();
		poem.add("ˮ��̶������Ծ");
		poem.add("������б̸ͺ�");
		//ֱ�ӽ�����ַ�������д��ָ���ļ���
		Files.write(Paths.get("poem.txt") , poem , Charset.forName("gbk"));
		FileStore cStore = Files.getFileStore(Paths.get("C:"));
		//�ж�C�̵��ܿռ䡢���ÿռ�
		System.out.println("C:���пռ䣺" + cStore.getTotalSpace());
		System.out.println("C:���ÿռ䣺" + cStore.getUsableSpace());
	}
}