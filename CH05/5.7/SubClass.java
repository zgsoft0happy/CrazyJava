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
	public int book = 6;
	public void base()
	{
		System.out.println("�������ͨ����");
	}
	public void test()
	{
		System.out.println("����ı����ǵķ���");
	}
}
public class SubClass extends BaseClass
{
	//���¶���һ��bookʵ��Field���ظ����bookʵ��Field
	public String book = "������Java EE��ҵӦ��ʵս";
	public void test()
	{
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String [] args)
	{
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		BaseClass bc = new BaseClass();
		//���6
		System.out.println(bc.book);
		//�������ε��ý�ִ��baseClass�ķ���
		bc.base();
		bc.test();
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		SubClass sc = new SubClass();
		//���"������Java EE��ҵӦ��ʵս"
		System.out.println(sc.book);
		//������ý�ִ�и���̳е���base����
		sc.base();
		//������ý�ִ�е�ǰ���test()����
		sc.test();
		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClass ploymophicBc = new SubClass();
		//���6 ---- �������ʵ��Ǹ���Field
		System.out.println(ploymophicBc.book);
		//������ý�ִ�дӸ���̳е���base����
		ploymophicBc.base();
		//������ý�ִ�е�ǰ���test����
		ploymophicBc.test();
		//��ΪploymophicBc�ı���ʱ������baseClass
		//BaseClass��û���ṩsub��������������������ʱ����ִ���
		//ploymophicBc.sub();
	}
}