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
import java.util.Collection;
public class RightTest
{
	//����һ�����ͷ������÷��ͷ����д�һ��T�β�
	static <T> void test(Collection<? extends T> from , Collection<T> to)
	{
		for (T ele : from)
		{
			to.add(ele);
		}
	}
	public static void main(String[] args)
	{
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		//���������ȫ����
		test(as , ao);
	}
}