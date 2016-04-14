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
import java.util.Arrays;
import java.util.List;
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("疯狂Java讲义" , "轻量级Java EE企业应用实战");
		//获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//遍历fixedList的集合元素
		for (int i = 0 ; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//试图增加、删除元素都会引发UnsupportedOperationException异常
		fixedList.add("疯狂Android讲义");
		fixedList.remove("疯狂Java讲义");
	}
}