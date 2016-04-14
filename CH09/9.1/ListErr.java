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
import java.util.List;
import java.util.ArrayList;
public class ListErr
{
	public static void main(String[] args)
	{
		//创建一个只想保存字符串类型的List集合
		List strList = new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//"不小心"把一个Integer对象“丢进”了集合
		strList.add(5);		//1
		for (int i = 0 ; i < strList.size() ; i++)
		{
			//因为List里取出的全部是Object，所以必须进行强制类型转换
			//最后一个元素将出现ClassCastException异常
			String str = (String)strList.get(i);	//2
		}
	}
}