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
import static java.util.Calendar.*;
import java.util.Calendar;
public class CalendarTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(YEAR));
		//ȡ���·�
		System.out.println(c.get(MONTH));
		//ȡ����
		System.out.println(c.get(DATE));
		//�ֱ������ꡢ�¡��ա�Сʱ�����ӡ���
		c.set(2003 , 10 , 23 , 12 , 32 ,23);		//2003-11-23  12:32:23
		System.out.println(c.getTime());
		//��Calendar����ǰ��1��
		c.add(YEAR , -1);		//2002-11-23  12:32:23
		//��Calendar����ǰ��8����
		c.roll(MONTH , -8);		//2002-03-23  12:32:23
		System.out.println(c.getTime());
	}
}