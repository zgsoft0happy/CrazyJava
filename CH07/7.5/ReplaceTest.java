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
public class ReplaceTest
{
	public static void main(String[] args)
	{
		String[] msgs =
		{
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		Pattern p = Pattern.compile("re\\w*");
		Matcher matcher = null;
		for (int i = 0 ; i < msgs.length ; i++)
		{
			if (matcher == null)
			{
				matcher = p.matcher(msgs[i]);
			}
			else
			{
				matcher.reset(msgs[i]);
			}
			System.out.println(matcher.replaceAll("����:)"));
		}
	}
}