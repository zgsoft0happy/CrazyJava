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
public class SwitchTest
{
	public static void main(String[] args)
	{
		//��������score����Ϊ�丳ֵΪ'C'
		char score = 'C';
		//ִ��switch��֧���
		switch(score)
		{
			case 'A':
				System.out.println("����");
				break;
			case 'B':
				System.out.println("����");
				break;
			case 'C':
				System.out.println("��");
				break;
			case 'D':
				System.out.println("����");
				break;
			case 'F':
				System.out.println("������");
				break;
			default:
				System.out.println("�ɼ��������");
		}
	}
}