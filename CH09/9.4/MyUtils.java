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
public class MyUtils
{
	//����dest����Ԫ�ص����ͱ�����src����Ԫ�ص�������ͬ�������丸��
	public static <T> T copy(Collection<? super T> dest , Collection<T> src)
	{
		T last = null;
		for (T ele :src)
		{
			last = ele;
			dest.add(ele);
		}
		return last;
	}
	public static void main(String[] args)
	{
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		//�˴���׼ȷ��֪�����һ�������Ƶ�Ԫ����Integer����
		//��src����Ԫ�ص�������ͬ
		Integer last = copy(ln , li);	//1
		System.out.println(ln);
	}
}