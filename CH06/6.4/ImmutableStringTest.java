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
public class ImmutableStringTest
{
	public static void main(String[] args)
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//���false
		System.out.println(str1 == str2);
		//���true
		System.out.println(str1.equals(str2));
		//�������������hashCode��ͬ
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}