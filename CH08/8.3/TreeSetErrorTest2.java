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
import java.util.TreeSet;
import java.util.Date;
public class TreeSetErrorTest2
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		//向TreeSet集合中添加两个对象
		ts.add(new String("Struts权威指南"));
		ts.add(new Date());		//1
	}
}