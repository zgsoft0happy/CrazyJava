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
public class PersonTest
{
	public static void main(String[] args)
	{
		//����һ��Person���͵ı���
		Person p;
		//ͨ��new�ؼ��ֵ���Person��Ĺ�����������һ��Personʵ��
		//����Personʵ������p����
		p = new Person();
		
		//����p��name Field��ֱ��Ϊ��Field��ֵ
		p.name = "���";
		//����p��say����������say����ʱ������һ���β�
		//���ø÷�������Ϊ�β�ָ��һ��ֵ
		p.say("Java���Ժܼ򵥣�ѧϰ�����ף�");
		//ֱ�����p��name Field��ֵ������� ���
		System.out.println(p.name);
	}
}