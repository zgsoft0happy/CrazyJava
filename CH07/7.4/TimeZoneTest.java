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
import java.util.Arrays;
import java.util.TimeZone;
public class TimeZoneTest
{
	public static void main(String[] args)
	{
		//ȡ��Java��֧�ֵ�����ʱ��ID
		String[] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		TimeZone my = TimeZone.getDefault();
		//��ȡϵͳĬ��ʱ����ID��Asia/Shanghai
		System.out.println(my.getID());
		//��ȡϵͳĬ��ʱ�������ƣ��й���׼ʱ��
		System.out.println(my.getDisplayName());
		//��ȡָ��ID��ʱ�����ƣ�Ŧ������׼ʱ��
		System.out.println(TimeZone.getTimeZone("CNT").getDisplayName());
	}
}