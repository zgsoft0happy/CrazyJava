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
public class StringBuilderTest
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		//׷���ַ���
		sb.append("java");		//sb = "Java"
		//����
		sb.insert(0 , "hello "); //sb = "hello Java"
		//�滻
		sb.replace(5 , 6 , ",");		//sb = "hello,java"
		//ɾ��
		sb.delete(5 , 6);		//sb = "hellojava"
		System.out.println(sb);
		//��ת
		sb.reverse();	//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());	//���9
		System.out.println(sb.capacity());	//���16
		//�ı�StringBuilder�ĳ��ȣ�ֻ����ǰ�沿��
		sb.setLength(5);		//sb = "avajo"
		System.out.println(sb);
	}
}