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
public class GenericMethodTest
{
	//����һ�����ͷ������÷��ͷ����д�һ��T�����β�
	static <T> void fromArrayToCollection(T[] a , Collection<T> c)
	{
		for (T o : a)
		{
			c.add(o);
		}
	}
	public static void main(String[] args)
	{
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//���������T����Object����
		fromArrayToCollection(oa , co);
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		//���������T����String����
		fromArrayToCollection(sa , cs);
		//���������T����Object����
		fromArrayToCollection(sa , co);
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<>();
		//���������T����Number����
		fromArrayToCollection(ia , cn);
		//���������T����Number����
		fromArrayToCollection(fa , cn);
		//���������T����Number����
		fromArrayToCollection(na , cn);
		//���������T����Object����
		fromArrayToCollection(na , co);
		//���������T����String���ͣ��� na��һ��Number����
		//��ΪNumber�Ȳ���String���ͣ�Ҳ�����������࣬���Ա������
		//fromArrayToCollection(na , cs);
	}
}