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
import java.util.*;
import java.text.MessageFormat;
public class HelloArg
{
	public static void main(String[] args)
	{
		//定义一个Locale变量
		Locale currentLocale = null;
		//如果运行程序指定了两个参数
		if (args.length == 2)
		{
			//使用运行程序的两个参数构造Locale实例
			currentLocale = new Locale(args[0] , args[1]);
		}
		else
		{
			//否则直接使用系统默认的Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//根据Locale加载语言资源
		ResourceBundle bundle = ResourceBundle.getBundle("myMess" , currentLocale);
		//取得已加载的语言资源文件中msg对应消息
		String msg = bundle.getString("msg");
		//使用MessageFormat为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg , "yeeku" , new Date()));
	}
}