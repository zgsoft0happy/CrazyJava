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
//����Apple��ʱʹ���˷�������
public class Apple<T>
{
	//ʹ��T�����βζ���ʵ������
	private T info;
	public Apple(){}
	//���淽����ʹ��T�����β������幹����
	public Apple(T info)
	{
		this.info = info;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public T getInfo()
	{
		return this.info;
	}
	public static void main(String[] args)
	{
		//��Ϊ����T�βε���Stringʵ������
		//���Թ������Ĳ���ֻ����String
		Apple<String> a1 = new Apple<>("ƻ��");
		System.out.println(a1.getInfo());
		//��Ϊ����T�βε���Doubleʵ������
		//���Թ������Ĳ���ֻ����Double����double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}
}