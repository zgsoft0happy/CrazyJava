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
public class PushbackTest
{
	public static void main(String[] args)
	{
		try(
			//����һ��PushbackReader����ָ���ƻػ������ĳ���Ϊ64
			PushbackReader pr = new PushbackReader(new FileReader("PushbackTest.java") , 64))
		{
			char[] buf = new char[32];
			//���Ա����ϴζ�ȡ���ַ�������
			String lastContent = "";
			int hasRead = 0;
			//ѭ����ȡ�ļ�����
			while ((hasRead = pr.read(buf)) > 0)
			{
				//������������ת�����ַ���
				String content = new String(buf , 0 , hasRead);
				int targetIndex = 0;
				//���ϴζ�ȡ���ַ����ͱ��ζ�ȡ���ַ���ƴ������
				//�鿴�Ƿ����Ŀ���ַ������������Ŀ���ַ���
				if((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0)
				{
					//���������ݺ��ϴ�����һ���ƻػ�����
					pr.unread((lastContent + content).toCharArray());
					//���¶���һ������ΪtargetIndex��char����
					if (targetIndex > 32)
					{
						buf = new char[targetIndex];
					}
					//�ٴζ�ȡָ�����ȵ����ݣ�����Ŀ���ַ���֮������ݣ�
					pr.read(buf , 0 , targetIndex);
					//��ӡ��ȡ������
					System.out.print(new String(buf , 0 , targetIndex));
					System.exit(0);
				}
				else
				{
					//��ӡ�ϴζ�ȡ������
					System.out.print(lastContent);
					//��������������Ϊ�ϴζ�ȡ������
					lastContent = content;
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}