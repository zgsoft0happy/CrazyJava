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
class Parent
{
	public String tag = "���Java����";			//1
}
class Derived extends Parent
{
	//����һ��˽�е�tagʵ�����������ظ����tagʵ������
	private String tag = "������Java EE��ҵӦ��ʵս";		//2
}
public class HideTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		//���򲻿ɷ���d��˽�б���tag������������佫����������
		//System.out.println(d.tag);		//3
		//��������������Java���塰
		System.out.println(((Parent)d).tag);
	}
}