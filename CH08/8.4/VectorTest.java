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
import java.util.Stack;
public class VectorTest
{
	public static void main(String[] args)
	{
		Stack v = new Stack();
		//���ν�����Ԫ��"push"��ջ
		v.push("���Java����");
		v.push("������Java EE��ҵӦ��ʵս");
		v.push("���Android����");
		//�����[���Java���壬������Java EE��ҵӦ��ʵս�����Android����]
		System.out.println(v);
		//���ʵ�һ��Ԫ�أ�����������"pop"��ջ����������Android����
		System.out.println(v.peek());
		//���������[���Java���壬������Java EE��ҵӦ��ʵս�����Android����]
		System.out.println(v);
		//"pop"��ջ��һ��Ԫ�أ���������Android����
		System.out.println(v.pop());
		//�����[���Java���壬������Java EE��ҵӦ��ʵս]
		System.out.println(v);
	}
}