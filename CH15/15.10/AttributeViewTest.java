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
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.nio.file.attribute.*;
public class AttributeViewTest
{
	public static void main(String[] args) throws Exception
	{
		//��ȡ��Ҫ�������ļ�
		Path testPath = Paths.get("AttributeViewTest.java");
		//��ȡ���ʻ������Ե�BasicFileAttributeView
		BasicFileAttributeView basicView = Files.getFileAttributeView(testPath , BasicFileAttributeView.class);
		//���ʻ������Ե�BasicFileAttributes
		BasicFileAttributes basicAttribs = basicView.readAttributes();
		//�����ļ��Ļ�������
		System.out.println("����ʱ�䣺" + new Date(basicAttribs.creationTime().toMillis()));
		System.out.println("������ʱ�䣺" + new Date(basicAttribs.lastAccessTime().toMillis()));
		System.out.println("����޸�ʱ�䣺" + new Date(basicAttribs.lastModifiedTime().toMillis()));
		System.out.println("�ļ���С��" + basicAttribs.size());
		//��ȡ�����ļ�������Ϣ��FileOwerAttributeView
		FileOwnerAttributeView ownerView = Files.getFileAttributeView(testPath , FileOwnerAttributeView.class);
		System.out.println("�����û���" + ownerView.getOwner());
		//��ȡϵͳ��guest��Ӧ���û�
		UserPrincipal user = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("guest");
		//�޸��û�
		//ownerView.setOwner(user);
		//��ȡ�����Զ������Ե�FileOwnerAttributeView
		UserDefinedFileAttributeView userView = Files.getFileAttributeView(testPath , UserDefinedFileAttributeView.class);
		List<String> attrNames = userView.list();
		//�������е��Զ�������
		for (String name : attrNames)
		{
			ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
			userView.read(name , buf);
			buf.flip();
			String value = Charset.defaultCharset().decode(buf).toString();
			System.out.println(name + "--->" + value);
		}
		//���һ���Զ�������
		userView.write("������" , Charset.defaultCharset().encode("YYB from ���Java����"));
		//��ȡ����DOS���Ե�DosFileAttributeView
		DosFileAttributeView dosView = Files.getFileAttributeView(testPath , DosFileAttributeView.class);
		//���ļ��������ء�ֻ��
		dosView.setHidden(true);
		dosView.setReadOnly(true);
	}
}