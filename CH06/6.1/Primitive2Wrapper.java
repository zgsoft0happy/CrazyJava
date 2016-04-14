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
public class Primitive2Wrapper
{
	public static void main(String[] args)
	{
		boolean b1 = true;
		//通过构造器把b1基本类型变量包装成包装类对象
		Boolean b1Obj = new Boolean(b1);
		int it = 5;
		//通过构造器把it基本类型变量包装秤包装类对象
		Integer itObj = new Integer(it);
		//把一个字符串转换成Float对象
		Float f1 = new Float("4.56");
		//把一个字符串转换成Boolean对象
		Boolean bObj = new Boolean("false");
		//下面程序运行时将出现java.lang.NumberFormatException异常
		//Long lObj = new Long("ddd");
		//取出Boolean对象里的boolean变量
		boolean bb = bObj.booleanValue();
		//取出Integer对象里的int变量
		int i = itObj.intValue();
		//取出Float对象里的float变量
		float f = f1.floatValue();
	}
}