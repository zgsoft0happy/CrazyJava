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
public class RandomStr
{
	public static void main(String[] args)
	{
		//����һ�����ַ���
		String result = "";
		//����6��ѭ��
		for(int i = 0 ; i < 6 ; i++)
		{
			//����һ��97~122֮���int��������
			int intValue = (int)(Math.random() * 26 + 97);
			//��intValueǿ��ת��Ϊchar���ͺ����ӵ�result����
			result = result + (char)intValue;
		}
		//�������ַ���
		System.out.println(result);
	}
}