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
public class ConversionTest
{
	public static void main(String[] args)
	{
		double d = 3.14;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		//����������ʱ������ͼ��һ����ֵ���ͱ���ת��Ϊboolean����
		//����ʱ����ʾ������ת��������
		//boolean b = (boolean)in;
		Object obj = "Hello";
		//obj�����ı���ʱ����ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//����obj����������ʵ������String���ͣ���������ʱҲ��ͨ��
		String objStr = (String)obj;
		System.out.println(objStr);
		//����һ��objPri����������ʱ����ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		//obPri�����ı���ʱ����ΪObject����String���͵ĸ���
		//���������������ʱ����ClassCastException�쳣
		String str = (String)objPri;
	}
}