/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-04  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
public class FileTest
{
	public static void main(String[] args) throws IOException
	{
		//�Ե�ǰ·��������һ��File����
		File file = new File(".");
		//ֱ�ӻ�ȡ�ļ��������һ��
		System.out.println(file.getName());
		//��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println(file.getParent());
		System.out.println("��ȡ����·��:" + file.getAbsoluteFile());
		System.out.println("��ȡ��һ��·����" + file.getAbsoluteFile().getParent());
		//�ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = File.createTempFile("aaa" , ".txt" , file);
		//ָ����JVM�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		//��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile�����Ƿ���ڣ�" + newFile.exists());
		//��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		//��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ�����
		//�������淽������false�����޷�����Ŀ¼
		newFile.mkdir();
		//ʹ��list()�����г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		System.out.println("====��ǰ·���������ļ���·������====");
		for (String fileName : fileList)
		{
			System.out.println(fileName);
		}
		//listRoots()��̬�����г����еĴ��̸�·��
		File[] roots = File.listRoots();
		System.out.println("====ϵͳ���и�·������====");
		for (File root : roots)
		{
			System.out.println(root);
		}
	}
}