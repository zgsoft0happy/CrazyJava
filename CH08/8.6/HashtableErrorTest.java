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
import java.util.Hashtable;
import java.util.Iterator;
public class HashtableErrorTest
{
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		//�˴���A����ǰһ�������A����ͬһ����
		ht.put(new A(60000) , "���Java����");
		ht.put(new A(87563) , "������Java EE��ҵӦ��ʵս");
		//���Hashtable��key Set���϶�Ӧ��Iterator������
		Iterator it = ht.keySet().iterator();
		//ȡ��Map�е�һ��key
		A first = (A)it.next();
		first.count = 87563;	//1
		//���{A@1560b=���Java���壬A@1560b=������java EE��ҵӦ��ʵս}
		System.out.println(ht);
		//ֻ��ɾ��û�б��޸Ĺ���key����Ӧ��key-value��
		ht.remove(new A(87563));
		System.out.println(ht);
		//�޷���ȡʣ�µ�value���������д��붼�����null
		System.out.println(ht.get(new A(87563)));		//2
		System.out.println(ht.get(new A(60000)));		//3
	}
}