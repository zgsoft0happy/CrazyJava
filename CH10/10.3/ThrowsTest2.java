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
public class ThrowsTest2
{
	public static void main(String[] args) throws Exception
	{
		//��Ϊtest()���������׳�IOException�쳣
		//���Ե��ø÷����Ĵ���Ҫô����try...catch����
		//Ҫô������һ����throws�����׳��ķ�����
		test();
	}
	public static void test() throws IOException
	{
		//��ΪFileInputSTream�Ĺ������������׳�IOException�쳣
		//���Ե���FileInputStream�Ĵ���Ҫô����try...catch����
		//Ҫô������һ����throws�����׳��ķ�����
		FileInputStream fis = new FileInputStream("a.txt");
	}
}