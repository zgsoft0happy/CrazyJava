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
public class TwoDimensionTest
{
	public static void main(String[] args)
	{
		//����һ����ά����
		int[][] a;
		//��a����һά������г�ʼ������ʼ��a��һ������Ϊ4������
		//a���������Ԫ����ʧ��������
		a = new int[4][];
		//��a���鵱��һά���飬����a�����ÿ������Ԫ�ء�
		for(int i = 0,len = a.length;i < len ; i++)
		{
			System.out.println(a[i]);
		}
		//��ʼ��a����ĵ�һ��Ԫ��
		a[0] = new int[2];
		//����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		//a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
		for(int i = 0 , len = a[0].length ; i < len ; i++)
		{
			System.out.println(a[0][i]);
		}
		
		//ͬʱ��ʼ����ά���������ά��
		int[][] b = new int[3][4];
		
		//ʹ�þ�̬��ʼ���﷨����ʼ��һ����ά����
		String[][] str1 = new String[][]{new String[3],new String[]{"hello"}};
		//ʹ�ü򻯵ľ�̬��ʼ���﷨����ʼ����ά����
		String[][] str2 = {new String[3],new String[]{"hello"}};
		
		
	}
}