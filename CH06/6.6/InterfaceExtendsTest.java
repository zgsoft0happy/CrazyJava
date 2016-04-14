/**
 * description£º
 * <br/>ÍøÕ¾£º<a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>CSDNÖ÷Ò³£º<a href="http://my.csdn.net/y1193329479">CSDNÖ÷Ò³</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
interface interfaceA
{
	int PROP_A = 5;
	void testA();
}
interface interfaceB
{
	int PROP_B = 6;
	void testB();
}
interface interfaceC extends interfaceA , interfaceB
{
	int PROP_C = 7;
	void test();
}
public class InterfaceExtendsTest
{
	public static void main(String[] args)
	{
		System.out.println(interfaceC.PROP_A);
		System.out.println(interface /.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}