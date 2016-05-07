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
public class WatchServiceTest
{
	public static void main(String[] args) throws Exception
	{
		//��ȡ�ļ�ϵͳ��WatchService����
		WatchService watchService = FileSystems.getDefault().newWatchService();
		//ΪC:�̸�·��ע�����
		Paths.get("C:/").register(watchService , StandardWatchEventKinds.ENTRY_CREATE ,
			StandardWatchEventKinds.ENTRY_MODIFY , StandardWatchEventKinds.ENTRY_DELETE);
		while (true)
		{
			//��ȡ��һ���ļ��仯�¼�
			WatchKey key = watchService.take();		//1
			for (WatchEvent<?> event : key.pollEvents())
			{
				System.out.println(event.context() + "�ļ�������" + event.kind() + "�¼���");
			}
			//����WatchKey
			boolean valid = key.reset();
			//�������ʧ�ܣ��˳�����
			if (!valid)
			{
				break;
			}
		}
	}
}