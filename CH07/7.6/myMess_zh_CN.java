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
public class myMess_zh_CN extends ListResourceBundle
{
	//定义资源
	private final Object myData[][] = 
	{
		{"msg" , "{0}，你好！今天的日期是{1}"}
	};
	//重写getContents()方法
	public Object[][] getContents()
	{
		//该方法返回资源的key-value对
		return myData;
	}
}