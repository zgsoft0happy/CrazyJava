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
import java.util.Scanner;
import java.io.File;
public class ScannerFileTest
{
	public static void main(String[] args) throws Exception
	{
		//��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java�ļ��������£�");
		//�ж��Ƿ�����һ��
		while (sc.hasNextLine())
		{
			//����ļ��е���һ��
			System.out.println(sc.nextLine());
			Thread.sleep(200);
		}
	}
}