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
import java.util.ArrayDeque;
public class ArrayDequeTest
{
	public static void main(String[] args)
	{
		ArrayDeque stack = new ArrayDeque();
		//���ν�����Ԫ��push��"ջ"
		stack.push("���Java����");
		stack.push("������Java EE��ҵӦ��ʵս");
		stack.push("���Android����");
		//�����[���Java���壬������Java EE��ҵӦ��ʵս�����Android����]
		System.out.println(stack);
		//���ʵ�һ��Ԫ�أ�����������pop��"ջ"����������Android����
		System.out.println(stack.peek());
		//���������[���Java���壬������Java EE��ҵӦ��ʵս�����Android����]
		System.out.println(stack);
		//pop����һ��Ԫ�أ���������Android����
		System.out.println(stack.pop());
		//�����[������Java EE��ҵӦ��ʵս�����Java����]
		System.out.println(stack);
	}
}