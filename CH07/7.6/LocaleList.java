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
import java.util.Locale;
public class LocaleList
{
	public static void main(String[] args)
	{
		//返回Java所支持的全部国家和语言的数组
		Locale[] localeList = Locale.getAvailableLocales();
		//遍历数组的每个元素，依次获取所支持的国家和语言
		for (int i = 0 ; i < localeList.length ; i++)
		{
			//输出所支持的国家和语言
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry() + " "
				+ localeList[i].getDisplayLanguage()
				+ "=" + localeList[i].getLanguage());
		}
	}
}