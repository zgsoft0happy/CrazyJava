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
public class PathTest
{
	public static void main(String[] args) throws Exception
	{
		//�Ե�ǰ·��������Path����
		Path path = Paths.get(".");
		System.out.println("path���������·������:" + path.getNameCount());
		System.out.println("path�ĸ�·����" + path.getRoot());
		//��ȡpath��Ӧ�ľ���·��
		Path absolutePath = path.toAbsolutePath();
		System.out.println(absolutePath);
		//��ȡ����·���ĸ�·��
		System.out.println("absolutePath�ĸ�·����" + absolutePath.getRoot());
		//��ȡ����·����������·��������
		System.out.println("absolutePath�������·��������" + absolutePath.getNameCount());
		System.out.println(absolutePath.getName(3));
		//�Զ��String������Path����
		Path path2 = Paths.get("g:" , "publish" , "codes");
		System.out.println(path2);
	}
}