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
public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		//ֱ�Ӱ�һ���������ͱ�������Integer����
		Integer inObj = 5;
		//ֱ�Ӱ�һ��boolean���ͱ�������һ��Object���ͱ���
		Object boolObj = true;
		int it = inObj;
		if (boolObj instanceof Boolean)
		{
			//�Ȱ�Object����ǿ������ת��ΪBoolean���ͣ��ٸ���boolean����
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}
}