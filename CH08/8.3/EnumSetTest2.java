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
import java.util.EnumSet;
import java.util.Collection;
import java.util.HashSet;
public class EnumSetTest2
{
	public static void main(String[] args)
	{
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		//复制Collection集合中的所有元素来创建EnumSet集合
		EnumSet enumSet = EnumSet.copyOf(c);	//1
		//输出[SPRING,FALL]
		System.out.println(enumSet);
		c.add("疯狂Java讲义");
		c.add("轻量级Java EE企业应用实战");
		//下面代码出现异常：因为c集合里的元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);	//2
	}
}