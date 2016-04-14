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
import java.util.WeakHashMap;
public class WeakHashMapTest
{
	public static void main(String[] args)
	{
		WeakHashMap whm = new WeakHashMap();
		//向WeakHashMap中添加三个key-value对
		//三个key都是匿名字符串对象（没有其他引用）
		whm.put(new String("语文") , new String("良好"));
		whm.put(new String("数学") , new String("及格"));
		whm.put(new String("英文") , new String("中等"));
		//向WeakHashMap中添加一个key-value对
		//该key是一个系统缓存的字符串对象
		whm.put("java" , new String("中等"));	//1
		//输出whm对象，将看到4个key-value对
		System.out.println(whm);
		//通知系统立即进行垃圾回收
		System.gc();
		System.runFinalization();
		//在通常情况下，将只看到一个key-value对
		System.out.println(whm);
	}
}