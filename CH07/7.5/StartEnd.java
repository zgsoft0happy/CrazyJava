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
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StartEnd
{
	public static void main(String[] args)
	{
		//����һ��Pattern���󣬲���������һ��Matcher����
		String regStr = "Java is very easy!";
		System.out.println("Ŀ���ַ����ǣ�" + regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find())
		{
			System.out.println(m.group() + "�Ӵ�����ʼλ�ã�"
				+ m.start() + "�������λ�ã�" + m.end());
		}
	}
}