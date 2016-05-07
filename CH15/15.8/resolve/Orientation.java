/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-07  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class Orientation
{
	public static final Orientation HORIZONTAL = new Orientation(1);
	public static final Orientation VERTICAL = new Orientation(2);
	private int value;
	private Orientation(int value)
	{
		this.value = value;
	}
	//为枚举类增加readResolve方法
	private Object readResolve() throws ObjectStreamException
	{
		if (value == 1)
		{
			return HORIZONTAL;
		}
		if (value == 2)
		{
			return VERTICAL;
		}
		return null;
	}
}