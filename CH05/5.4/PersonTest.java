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
		Person p =new Person();
		//��Ϊage Field�ѱ����Σ�����������佫���ֱ������
		//p.age = 1000;
		//���������벻����ִ��󣬵�����ʱ����ʾ�������õ����䲻�Ϸ���
		//���򲻻��޸�p��age Field
		p.setAge(1000);
		//����p��age FieldҲ����ͨ�����Ӧ��getter����
		//��Ϊ�����δ�ɹ�����p��age Field���ʴ˴����0
		System.out.println("δ������age Fieldʱ��" + p.getAge());
		//�ɹ��޸�p��age Field
		p.setAge(30);
		//��Ϊ����ɹ�������p��age Field���ʴ˴����30
		System.out.println("�ɹ�����age Field��" + p.getAge());
		//����ֱ�Ӳ���p��name Field������ͨ�����Ӧ��setter����
		//��Ϊ"���"�ַ�����������2~6�����Կ��Գɹ�����
		p.setName("���");
		System.out.println("�ɹ�����name Field��" + p.getName());
	}
}