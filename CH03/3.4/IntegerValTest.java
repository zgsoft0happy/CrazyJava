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
public class IntegerValTest
{
	public static void main(String[] args)
	{
		//�����������ȷ�ģ�ϵͳ���Զ���56����byte���ʹ���
		byte a = 56;
		/*
		��������Ǵ���ģ�ϵͳ�����9999999999999����long���ʹ���
		���Գ���int�ı�����Χ���Ӷ��������
		*/
		//long bigValue = 9999999999999;
		//�����������ȷ�ģ��ھ޴������������ʹ��L��׺��ǿ��ʹ��long����
		long bigValue2 = 9223372036854775807L;
		
		
		//��0��ͷ�����������ǰ˽��Ƶ�����
		int octalValue = 013;
		//��0x��0X��ͷ������������ʮ�����Ƶ�����
		int hexValue1 = 0x13;
		int hexValue2 = 0XaF;
		
		
		//��������8λ�Ķ���������
		int binValue1 = 0b11010100;
		byte binValue2 = 0b01101001;
		//����һ��32λ�Ķ��������������λ�Ƿ���λ
		int binValue3 = 0B10000000000000000000000000000011;
		System.out.println(binValue1);	//���212
		System.out.println(binValue2);	//���105
		System.out.println(binValue3);	//���-2147483645
		
		
		/*
		����һ��32λ�Ķ���������������ֵĬ��ռ32λ���������һ��������
		ֻ��ǿ������ת����byteʱ��������������յ���binValue4�����-23
		*/
		byte binValue4 = (byte)0b11101001;
		/*
		����һ��32λ�Ķ��������������λ�Ƿ���λ��
		��������ֵ�������L��׺����˸�����ʵ��ռ64Ϊ����32λ��1���Ƿ���λ��
		���binValue5��ֵ����2��31�η� + 2 + 1
		*/
		long binValue5 = 0B10000000000000000000000000000011L;
		System.out.println(binValue4);	//���-23
		System.out.println(binValue5);	//���2147483651
	}
}