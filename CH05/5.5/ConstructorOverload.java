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
public class ConstructorOverload
{
	public String name;
	public int count;
	//�ṩ�޲����Ĺ�����
	public ConstructorOverload()
	{
	}
	//�ṩ�����������Ĺ�����
	//�Ըù��������صĶ���ִ�г�ʼ��
	public ConstructorOverload(String name,int count)
	{
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		//ͨ���޲�������������ConstructorOverload����
		ConstructorOverload oc1 = new ConstructorOverload();
		//ͨ���в�������������ConstructorOverload
		ConstructorOverload oc2 = new ConstructorOverload("������Java EE��ҵӦ��ʵս",300000);
		System.out.println(oc1.name + " " + oc1.count);
		System.out.println(oc2.name + " " + oc2.count);
	}
}