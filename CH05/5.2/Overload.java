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
public class Overload
{
	//���涨��������test���������������β��б�ͬ
	//ϵͳ���������������������ⱻ��Ϊ��������
	public void test()
	{
		System.out.println("�޲���");
	}
	public void test(String msg)
	{
		System.out.println("���ص�test����" +msg);
	}
	public static void main(String[] args)
	{
		Overload ol = new Overload();
		//����testʱû�д�����������ϵͳ��������û�в�����test����
		ol.test();
		//����testʱ������һ���ַ�������
		//���ϵͳ����������һ���ַ���������test����
		ol.test("hello");
	}
}