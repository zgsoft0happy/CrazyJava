/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import  java.lang.reflect.*;
public class ProcessorTest
{
	public static void process(String clazz) throws ClassNotFoundException
	{
		int passed = 0;
		int failed = 0;
		//遍历clazz对应的类里的所有方法
		for (Method m : Class.forName(clazz).getMethods())
		{
			//如果该方法使用了@Testable修饰
			if (m.isAnnotationPresent(Testable.class))
			{
				try
				{
					//调用m方法
					m.invoke(null);
					//passed加1
					passed++;
				}
				catch (Exception ex)
				{
					System.out.println("方法" + m + "运行失败，异常：" + ex.getCause());
					failed++;
				}
			}
		}
		//统计测试结果
		System.out.println("共运行了：" + (passed + failed) + "个方法，其中：\n"
			+ "失败了：" + failed + "个，\n成功了：" + passed + "个！");
	}
}