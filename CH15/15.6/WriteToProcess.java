/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-05  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.io.*;
import java.util.Scanner;
public class WriteToProcess
{
	public static void main(String[] args) throws IOException
	{
		//����java ReadStandard����������и�������ӽ���
		Process p = Runtime.getRuntime().exec("java ReadStandard");
		try(
			//��p���̵����������PrintStrean����
			//���������Ա����������������p��������������
			PrintStream ps = new PrintStream(p.getOutputStream()))
		{
			//��ReadStandard����д�����ݣ���Щ���ݽ���ReadStandard��ȡ
			ps.println("��ͨ�ַ���");
			ps.println(new WriteToProcess());
		}
	}
}
//����һ��ReadStandard�࣬������Խ��ձ�׼����
//������׼����д��out.txt�ļ�
class ReadStandard
{
	public static void main(String[] args)
	{
		try(
			//ʹ��System.in����Scanner�������ڻ�ȡ��׼����
			Scanner sc = new Scanner(System.in);
			PrintStream ps = new PrintStream(new FileOutputStream("out1.txt")))
		{
			//��������һ��ֻ�ѻس���Ϊ�ָ���
			sc.useDelimiter("\n");
			//�ж��Ƿ�����һ��������
			while(sc.hasNext())
			{
				//���������
				ps.println("��������������ǣ�" + sc.next());
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}