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
public class Primitive2Wrapper
{
	public static void main(String[] args)
	{
		boolean b1 = true;
		//ͨ����������b1�������ͱ�����װ�ɰ�װ�����
		Boolean b1Obj = new Boolean(b1);
		int it = 5;
		//ͨ����������it�������ͱ�����װ�Ӱ�װ�����
		Integer itObj = new Integer(it);
		//��һ���ַ���ת����Float����
		Float f1 = new Float("4.56");
		//��һ���ַ���ת����Boolean����
		Boolean bObj = new Boolean("false");
		//�����������ʱ������java.lang.NumberFormatException�쳣
		//Long lObj = new Long("ddd");
		//ȡ��Boolean�������boolean����
		boolean bb = bObj.booleanValue();
		//ȡ��Integer�������int����
		int i = itObj.intValue();
		//ȡ��Float�������float����
		float f = f1.floatValue();
	}
}