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
public class StringNodeTest
{
	public static void main(String[] args)
	{
		String src = "����������һ���Ҹ�����\n"
			+ "ι��������������\n"
			+ "�������𣬹�����ʳ���߲�\n"
			+ "����һ�����ӣ��泯�󺣣���ů����\n"
			+ "�������𣬺�ÿһ������ͨ��\n"
			+ "���������ҵ��Ҹ�\n";
			char[] buffer = new char[32];
			int hasRead = 0 ;
			try(
				StringReader sr = new StringReader(src))
			{
				//����ѭ����ȡ�ķ�ʽ��ȡ�ַ���
				while ((hasRead = sr.read(buffer)) > 0)
				{
					System.out.print(new String(buffer , 0 , hasRead));
				}
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
			try(
				//����StringWriterʱ��ʵ������һ��StringBuffer��Ϊ����ӵ�
				//����ָ����20����StringBuffer�ĳ�ʼ����
				StringWriter sw = new StringWriter())
			{
				//����StringWriter�ķ���ִ�����
				sw.write("��һ�������������磬\n");
				sw.write("����Զ�����ң�\n");
				sw.write("����������ĺ��ӣ�\n");
				sw.write("���й���ľ���\n");
				System.out.println("----������sw�ַ����ڵ��������----");
				//ʹ��toString()��������StringWriter�ַ����ڵ������
				System.out.println(sw.toString());
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
	}
}