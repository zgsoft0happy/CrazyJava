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
public class KeyboardInTest
{
	public static void main(String[] args) throws Exception
	{
		//��System.in�ֽ���Ϊ����������һ��BufferedReader����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//���ж�ȡ��������
		while ((line = br.readLine()) != null)
		{
			System.out.println("�û����������ǣ�" + line);
		}
	}
}