/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatchesTest
{
	public static void main(String[] args)
	{
		String[] mails =
		{
			"kongyeeku@163.com" ,
			"kongyeeku@gmail.com" ,
			"ligang@crazyit.org" ,
			"wawa@abc.xx"
		};
		String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
		Pattern mailPattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for (String mail : mails)
		{
			if (matcher == null)
			{
				matcher = mailPattern.matcher(mail);
			}
			else
			{
				matcher.reset(mail);
			}
			String result = mail + (matcher.matches() ? "是" : "不是") 
				+ "一个有效的邮件地址！";
			System.out.println(result);
		}
	}
}