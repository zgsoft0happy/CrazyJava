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
class Apple<T extends Number>
{
	T size;
	public Apple(){}
	public Apple(T size)
	{
		this.size = size;
	}
	public void setSize(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		return this.size;
	}
}
public class ErasureTest
{
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<>(6);	//1
		//a��getSize()��������Integer����
		Integer as = a.getSize();
		//��a���󸳸�Apple��������ʧ���������������Ϣ
		Apple b = a;	//2
		//bֻ֪��size��������Number
		Number size1 = b.getSize();
		//�����������������
		Integer size2 = b.getSize();	//3
	}
}