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
import java.lang.ref.WeakReference;
public class ReferenceTest
{
	public static void main(String[] args) throws Exception
	{
		//创建一个字符串对象
		String str = new String("疯狂Java讲义");
		//创建一个弱引用，让此弱引用引用到“疯狂Java讲义”字符串
		WeakReference wr = new WeakReference(str);		//1
		//切断str引用和“疯狂Java讲义”字符串之间的引用
		str = null; 	//2
		//取出弱引用所引用的对象
		System.out.println(wr.get());		//3
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//再次取出弱引用所引用的对象
		System.out.println(wr.get());		//4
	}
}