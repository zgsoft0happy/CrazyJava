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
public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] books = {"������Java EE��ҵӦ��ʵս","���Java����","���Android����"};
		//ʹ��foreachѭ������������Ԫ��
		//����book�����Զ�����ÿ������Ԫ��
		for(String book : books)
		{
			System.out.println(book);
		}
	}
}