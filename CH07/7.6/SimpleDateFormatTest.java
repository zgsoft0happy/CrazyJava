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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class SimpleDateFormatTest
{
	public static void main(String[] args) throws ParseException
	{
		Date d = new Date();
		//����һ��SimpleDateFormat����
		SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy���е�D��");
		//��d��ʽ�������ڣ��������԰2007���е�354��
		String dateStr = sdf1.format(d);
		System.out.println(dateStr);
		//һ���ǳ�����������ַ���
		String str = "07###����##21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
		//�������ַ������������ڣ������Wed Mar 21 00:00:00 CST 2007
		System.out.println(sdf2.parse(str));
	}
}