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
import java.io.*;
public class AutoCloseTest
{
	public static void main(String[] args) throws IOException
	{
		try (
			//��������ʼ�������ɹرյ���Դ
			//try�����Զ��ر���������Դ
			BufferedReader br = new BufferedReader(
				new FileReader("AutoCloseTest.java"));
			PrintStream ps = new PrintStream(new
				FileOutputStream("a.txt")))
		{
			//ʹ��������Դ
			System.out.println(br.readLine());
			ps.println("ׯ�������Ժ���");
		}
	}
}