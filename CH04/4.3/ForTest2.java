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
public class ForTest2
{
	public static void main(String[] args)
	{
		//ͬʱ������������ʼ��������ʹ��&&����϶��boolean���ʽ
		for(int b = 0 , s = 0 , p = 0 ; b < 10 && s < 4 && p < 10 ; p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}