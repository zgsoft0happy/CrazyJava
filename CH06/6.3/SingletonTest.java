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
class Singleton
{
	//ʹ��һ����������������������ʵ��
	private static Singleton instance;
	//�Թ�����ʹ��private���Σ����ظù�����
	private Singleton(){}
	//�ṩһ����̬���������ڷ���Singletonʵ��
	//�÷������Լ����Զ�����ƣ���ֻ֤����һ��Singleton����
	public static Singleton getInstance()
	{
		//���instanceΪnull�����������������Singleton����
		//���instance��Ϊnull��������Ѿ�������Singleton����
		//���������´����µ�ʵ��
		if (instance == null)
		{
			//����һ��Singleton���󣬲����仺������
			instance = new Singleton();
		}
		return instance;
	}
}
public class SingletonTest
{
	public static void main(String[] args)
	{
		//����SingleTon������ͨ��������
		//ֻ��ͨ��getInstance�������õ�ʵ��
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//�����true
		System.out.println(s1 == s2);
	}
}