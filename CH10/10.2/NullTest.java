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
import java.util.Date;
public class NullTest
{
	public static void main(String[] args)
	{
		Date d = null;
		try
		{
			System.out.println(d.after(new Date()));
		}
		catch (NullPointerException ne)
		{
			System.out.println("��ָ���쳣");
		}
		catch (Exception e)
		{
			System.out.println("δ֪�쳣");
		}
	}
}