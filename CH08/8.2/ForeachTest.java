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
import java.util.Collection;
import java.util.HashSet;
public class ForeachTest
{
	public static void main(String[] args)
	{
		//����һ������
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		for (Object obj : books)
		{
			//�˴���book����Ҳ���Ǽ���Ԫ�ر���
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				//������������ConcurrentModificationException�쳣
				books.remove(book);		//1
			}
		}
		System.out.println(books);
	}
}