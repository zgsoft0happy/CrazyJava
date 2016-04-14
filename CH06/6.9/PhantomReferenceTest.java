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
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
public class PhantomReferenceTest
{
	public static void main(String[] args) throws Exception
	{
		//创建一个字符串对象
		String str = new String("疯狂Java讲义");
		//创建一个引用队列
		ReferenceQueue rq = new ReferenceQueue();
		//创建一个虚引用，让此虚引用引用到”疯狂Java讲义“字符串
		PhantomReference pr = new PhantomReference(str , rq);
		//切断str引用和”疯狂Java讲义“字符串之间的引用
		str = null;
		//取出虚引用所引用的对象
		//并不能通过虚引用被引用的对象，所以此处输出null
		System.out.println(pr.get());		//1
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//垃圾回收之后，虚引用将被放入引用队列中
		//取出引用队列中最先进入队列的引用与pr进行比较
		System.out.println(rq.poll()  == pr);		//2
	}
}