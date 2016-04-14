/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;
public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		//��ȡϵͳ���еĻ�������
		Map<String , String> env = System.getenv();
		for (String name : env.keySet())
		{
			System.out.println(name + " ---> " + env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//�����е�ϵͳ���Ա�����props.txt�ļ���
		props.store(new FileOutputStream("props.txt") , "System Properties");
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}