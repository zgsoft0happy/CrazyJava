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
public class EnumerationTest
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("疯狂Java讲义");
		v.add("轻量级Java EE企业应用实战");
		Hashtable scores = new Hashtable();
		scores.put("语文" , 78);
		scores.put("数学" , 88);
		Enumeration em = v.elements();
		while (em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		Enumeration keyEm = scores.keys();
		while (keyEm.hasMoreElements())
		{
			Object key = keyEm.nextElement();
			System.out.println(key + "--->" +scores.get(key));
		}
	}
}