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
class BaseClass
{
	public int a = 5;
}
public class SubClass extends BaseClass
{
	public int a = 7;
	public void accessOwner()
	{
		System.out.println(a);
	}
	public void accessBase()
	{
		//ͨ��super���޶����ʴӸ���̳еõ���a Field
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		SubClass sc = new SubClass();
		//���7
		sc.accessOwner();
		//���5
		sc.accessBase();
	}
}