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
public class TeachableProgrammer extends Programmer
{
	public TeachableProgrammer(){}
	public TeachableProgrammer(String name)
	{
		super(name);
	}
	//��ѧ������Ȼ��TeachableProgrammer�ඨ��
	private void teach()
	{
		System.out.println(getName() + "��ʦ�ڽ�̨�Ͻ���...");
	}
	private class Closure implements Teachable
	{
		/*
		�Ǿ�̬�ڲ���ٵ��ⲿ��ʵ��work�������Ǿ�̬�ڲ������õ����ý�����
		��ͻ��ṩһ���ٵ��ⲿ���;��
		*/
		public void work()
		{
			teach();
		}
	}
	//����һ���Ǿ�̬�ڲ������ã������ⲿ��ͨ���þ�̬�ڲ����������ص��ⲿ��ķ���
	public Teachable getCallbackReference()
	{
		return new Closure();
	}
}