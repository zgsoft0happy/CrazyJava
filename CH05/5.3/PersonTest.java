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
class Person
{
	//����һ��ʵ��Field
	public String name;
	//����һ����Field
	public static int eyeNum;
}
public class PersonTest
{
	public static void main(String[] args)
	{
		//Person���Ѿ���ʼ���ˣ���eyeNum�����������ˣ����0
		System.out.println("Person��eyeNum��Fieldֵ��" + Person.eyeNum);
		//����Person����
		Person p = new Person();
		//ͨ��Person�����Ӧ��p������Person����nameʵ��Field
		//��ͨ��ʵ������eyeNum��field
		System.out.println("p������name Fieldֵ�ǣ�" + p.name + " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		//ֱ��Ϊnameʵ��Field��ֵ
		p.name = "�����";
		//ͨ��p����eyeNum��Field����Ȼ�Ƿ���Person��eyeNum��Field
		p.eyeNum = 2;
		//�ٴ�ͨ��Person����������nameʵ��Field��eyeNum��field
		System.out.println("p������name Fieldֵ�ǣ�" + p.name + " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		//ǰ��ͨ��p�޸���Person��eyeNum���˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum��Fieldֵ��" + Person.eyeNum);
		Person p2 = new Person();
		//p2���ʵ�eyeNum��Field��Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum��Fieldֵ��" + p2.eyeNum);
	}
}