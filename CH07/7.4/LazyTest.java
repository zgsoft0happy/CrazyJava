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
import java.util.Calendar;
import static java.util.Calendar.*;
public class LazyTest
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);		//2003-8-31
		//���·���Ϊ9����9��31�ղ�����
		//��������޸ģ�ϵͳ�����cal�Զ�������10��1��
		cal.set(MONTH , 8);
		//����������10��1��
		//System.out.println(cal.getTime());	//1
		//����DATE�ֶ�Ϊ5
		cal.set(DATE , 5);		//2
		System.out.println(cal.getTime());		//3
	}
}