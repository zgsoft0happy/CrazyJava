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
public class FileWriterTest
{
	public static void main(String[] args)
	{
		try(
			FileWriter fw = new FileWriter("poem.txt"))
		{
			fw.write("��ɪ - ������\r\n");
			fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}