/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class AutoPromote
{
	public static void main(String[] args)
	{
		//����һ��short���ͱ���
		short sValue = 5;
		//���ʽ�е�sValue���Զ�������int���ͣ����ұߵı��ʽ����Ϊint
		//��һ��int����ֵ����short���ͱ�������������
		//sValue = sValue - 2;
		
		
		byte b = 40;
		char c = 'a';
		int i = 23;
		double d = .314;
		//�ұ߱��ʽ����ߵȼ�������Ϊd��double���ͣ�
		//���ұ߱���ǵ�����Ϊdouble���ͣ��ʸ���һ��double���ͱ���
		double result = b + c + i * d;
		//�����144.222
		System.out.println(result);
		
		
		int val = 3;
		//�ұ߱��ʽ����������������int���ͣ����ұ߱��ʽ������Ϊint
		//��Ȼ23/3���ܳ���������Ȼ�õ�һ��int��������
		int intResult = 23/val;
		//�����7
		System.out.println(intResult);
		
		//����ַ���Hello!a7
		System.out.println("Hello!" + 'a' + 7);
		//����ַ���104Hello!
		System.out.println('a' + 7 + "Hello!");
	}
}