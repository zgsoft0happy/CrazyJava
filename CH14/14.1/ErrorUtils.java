/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.*;
public class ErrorUtils
{
	public static void faultyMethod(List<String>... listStrArray)
	{
		//Java���Բ��������������飬���listArrayֻ�ܱ�����List[]����
		//��ʱ�൱�ڰ�List<String>������List���Ѿ�������"����Ⱦ"
		List[] listArray = listStrArray;
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//��listArray�ĵ�һ��Ԫ�ظ�ΪmyArray
		listArray[0] = myList;
		String s = listStrArray[0].get(0);
	}
}