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
/*
public class ErasureTest2
{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li ;
		//�����������δ������ת�������棬���롢����ʱ��ȫ����
		List<String> ls = list;	//1
		//ֻҪ����ls���Ԫ�أ����´��뽫��������ʱ�쳣
		System.out.println(ls.get(0));
	}
}
*/
public class ErasureTest2
{
	public static void main(String[] args)
	{
		List li = new ArrayList();
		li.add(6);
		li.add(9);
		System.out.println((String)li.get(0));
	}
}