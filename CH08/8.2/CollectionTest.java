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
public class CollectionTest
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("�����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ�����" + c.contains("�����"));
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//ɾ��c�����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�" + books);
	}
}