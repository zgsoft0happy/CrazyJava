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
class Person
{
	//年龄
	public int age;
	//身高
	public double height;
	//定义一个info方法
	public void info()
	{
		System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
	}
}

public class ReferenceArrayTest
{
	public static void main(String[] arsg)
	{
		//定义一个students数组变量，其类型是Personp[]
		Person[] students;
		//执行动态初始化
		students = new Person[2];
		//创建一个Person实例，并将这个Person实例赋给zhang变量
		Person zhang = new Person();
		//为zhang所引用的Person对象的age、height赋值
		zhang.age = 15;
		zhang.height = 158;
		//创建一个Person实例，并将这个Person实例赋给lee变量
		Person lee = new Person();
		//为lee所引用的Person对象的age、height赋值
		lee.age = 16;
		lee.height = 161;
		//将zhang变量的值赋给第一个数组元素
		students[0] = zhang;
		//将lee变量的值赋给第二个数组元素
		students[1] = lee;
		//下面两行代码的结果完全一样，因为lee
		//和students[1]指向的是同一个Person实例
		lee.info();
		students[1].info();
	}
}