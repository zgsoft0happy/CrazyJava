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
public class ThisInConstructor
{
	//����һ����Ϊfoo��Field
	public int foo;
	public ThisInConstructor()
	{
		//�ڹ������ﶨ��һ��foo����
		int foo = 0;
		//ʹ��this����˹��������г�ʼ���Ķ���
		//����Ĵ��뽫��Ѹմ����Ķ����foo Field����Ϊ6
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		//����ʹ��ThisInConstructor�����Ķ����foo Field
		//��������Ϊ6������������뽫���6
		System.out.println(new ThisInConstructor().foo);
	}
}