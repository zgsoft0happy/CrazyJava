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
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class ThrowTest2
{
	public static void main(String[] args)
		//Java 6��Ϊ1�Ŵ�������׳�Exception�쳣
		//���Դ˴������׳�Exception�쳣
		//throws Exception
		throws FileNotFoundException
	{
		try
		{
			new FileOutputStream("a.txt");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;		//1
		}
	}
}