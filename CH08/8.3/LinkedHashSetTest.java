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
import java.util.LinkedHashSet;
public class LinkedHashSetTest
{
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		System.out.println(books);
		//ɾ�� ���Java����
		books.remove("���Java����");
		//������� ���Java����
		books.add("���Java����");
		System.out.println(books);
	}
}