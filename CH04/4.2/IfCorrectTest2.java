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
public class IfCorrectTest2
{
	public static void main(String[] args)
	{
		int age =45;
		if(age > 60)
		{
			System.out.println("������");
		}
		//��ԭ����if������������else����������
		else if(age > 40 && !(age > 60))
		{
			System.out.println("������");
		}
		//��ԭ����if ������������else����������
		else if(age > 20 && !(age >60) && !(age >40 && !(age > 60)))
		{
			System.out.println("������");
		}
	}
}