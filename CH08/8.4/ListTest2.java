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
import java.util.List;
import java.util.ArrayList;
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class ListTest2
{
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		System.out.println(books);
		//ɾ�������е�A���󣬽����´�һ��Ԫ�ر�ɾ��
		books.remove(new A());		//1
		System.out.println(books);
		//ɾ�������е�A�����ٴ�ɾ�������еĵ�һ��Ԫ��
		books.remove(new A());		//2
		System.out.println(books);
	}
}