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
class DataWrap
{
	public int a;
	public int b;
}
public class ReferenceTransferTest
{
	public static void swap(DataWrap dw)
	{
		//�������д���ʵ��dw��a��b����Fieldֵ����
		//����һ����ʱ����������dw�����a Field��ֵ
		int tmp = dw.a;
		//��dw�����b Field��ֵ����a Field
		dw.a = dw.b;
		//����ʱ����tmp��ֵ����dw�����b Field
		dw.b = tmp;
		System.out.println("swap�����a Field��ֵ��" + dw.a + "��b Field��ֵ��" + dw.b);
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a Field��ֵ��" + dw.a + "��b Field��ֵ��" + dw.b);
	}
}