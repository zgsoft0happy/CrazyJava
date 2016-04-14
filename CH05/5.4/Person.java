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
public class Person
{
	//将Field使用private 修饰，将这些Field隐藏起来
	private String name;
	private int age;
	//提供方法来操作name Field
	public void setName(String name)
	{
		//执行合理性校验，要求用户名必须在2~6位之间
		if(name.length() > 6 || name.length() < 2)
		{
			System.out.println("您设置的人命不符合要求");
			return;
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		return this.name;
	}
	//提供方法来操作age Field
	public void setAge(int age)
	{
		//执行合理性校验，要求用户年龄必须在0~100之间
		if(age > 100 || age < 0)
		{
			System.out.println("您设置的年龄不合法");
			return;
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
}