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
class Apple
{
	//����info�����ѹ�ʱ
	@Deprecated
	public void info()
	{
		System.out.println("Apple��info����");
	}
}
public class DeprecatedTest
{
	public static void main(String[] args)
	{
		//����ʹ��info����ʱ���ᱻ����������
		new Apple().info();
	}
}