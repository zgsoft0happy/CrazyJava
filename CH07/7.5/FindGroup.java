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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindGroup
{
	public static void main(String[] args)
	{
		//����һ��Pattern���󣬲���������һ��Matcher����
		Matcher m = Pattern.compile("\\w+").matcher("Java is very easy!");
		while(m.find())
		{
			System.out.println(m.group());
		}
		int i = 0;
		while(m.find(i))
		{
			System.out.print(m.group() + "\t");
			i++;
		}
	}
}