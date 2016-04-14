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
class Person
{
	private int age;
	public Person(){}
	//有参数构造器
	public Person(int age)
	{
		this.age = age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}
public class FinalReferenceTest
{
	public static void main(String[] args)
	{
		//final修饰数组变量，iArr是意义引用变量
		final int[] iArr = {5, 6, 12, 9};
		System.out.println(Arrays.toString(iArr));
		//对数组元素进行排序，合法
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//对数组元素赋值，合法
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//下面语句对iArr重新赋值，非法
		//iArr = null;
		//final修饰Person变量，p是一个引用变量
		final Person p = new Person(45);
		//改变Person对象的age Field，合法
		p.setAge(23);
		System.out.println(p.getAge());
		//下面语句对p重新赋值，非法
		//p = null;
	}
}