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
import java.util.ResourceBundle;
public class Hello
{
	public static void main(String[] args)
	{
		//取得系统默认的国家/语言环境
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		//根据指定的国家/语言环境加载资源文件
		ResourceBundle bundle = ResourceBundle.getBundle("mess" , myLocale);
		//打印从资源文件中取得的消息
		System.out.println(bundle.getString("hello"));
	}
}