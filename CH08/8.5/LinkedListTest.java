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
import java.util.LinkedList;
public class LinkedListTest
{
	public static void main(String[] args)
	{
		LinkedList books = new LinkedList();
		//���ַ���Ԫ�ؼ�����е�β��
		books.offer("���Java����");
		//��һ���ַ���Ԫ�ؼ���ջ�Ķ���
		books.push("������Java EE��ҵӦ��ʵս");
		//���ַ���Ԫ����ӵ����е�ͷ��(�൱��ջ�Ķ���)
		books.offerFirst("���Android����");
		for (int i = 0 ; i <books.size() ; i++)
		{
			System.out.println(books.get(i));
		}
		//���ʵ���ɾ��ջ����Ԫ��
		System.out.println(books.peekFirst());
		//���ʵ���ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//��ջ����Ԫ�ص�����ջ��
		System.out.println(books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println(books);
		//���ʲ�ɾ�����е����һ��Ԫ��
		System.out.println(books.pollLast());
		//�������������������ֻʣ���м�һ��Ԫ�أ�
		//������Java EE��ҵӦ��ʵս
		System.out.println(books);
	}
}