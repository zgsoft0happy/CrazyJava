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
import java.util.*;
public class IteratorErrorTest
{
	public static void main(String[] args)
	{
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				//ʹ��Iterator���������У������޸ļ���Ԫ�أ������������һ��
				books.remove(book);
			}
		}
	}
}