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
public class KeyinTest
{
	public static void main(String[] args)
	{
		try(
			//��System.in����ת����Reader����
			InputStreamReader reader = new InputStreamReader(System.in);
			//����ͨ��Reader��װ��BufferedReader
			BufferedReader br = new BufferedReader(reader))
		{
			String buffer = null;
			//����ѭ����ʽ�����еض�ȡ
			while ((buffer = br.readLine()) != null)
			{
				//�����ȡ���ַ���Ϊ"exit"��������˳�
				if (buffer.equals("exit"))
				{
					System.exit(1);
				}
				//��ӡ��ȡ������
				System.out.println("��������Ϊ��" + buffer);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}