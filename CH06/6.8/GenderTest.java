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
public class GenderTest
{
	public static void main(String[] args)
	{
		//通过Enum的valueOf方法来获取指定枚举类的枚举值
		Gender g = Enum.valueOf(Gender.class , "FEMALE");
		//直接为枚举值得Field赋值
		g.name = "女";
		//直接访问枚举值的Field值
		System.out.println(g + "代表：" + g.name);
	}
}