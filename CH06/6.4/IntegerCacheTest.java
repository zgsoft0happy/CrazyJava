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
public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		//�����µ�Integer����
		Integer in1 = new Integer(6);
		//�����µ�Integer���󣬲�����ö���
		Integer in2 = Integer.valueOf(6);
		//ֱ�Ӵӻ�����ȡ��Integer����
		Integer in3 = Integer.valueOf(6);
		//���false
		System.out.println(in1 == in2);
		//���true
		System.out.println(in2 == in3);
		//����Integerֻ����-128~127֮���ֵ
		//���200��Ӧ��Integer����û�б�����
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5);	//���false
		
	}
}