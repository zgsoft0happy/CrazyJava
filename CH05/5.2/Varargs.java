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
public class Varargs
{
	//�������βθ����ɱ�ķ���
	public static void test(int a,String... books)
	{
		//book���������鴦��
		for(String tmp : books)
		{
			System.out.println(tmp);
		}
		//�����������a��ֵ
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		//����test����
		test(5,"���Java����","������Java EE��ҵӦ��ʵս");
	}
}