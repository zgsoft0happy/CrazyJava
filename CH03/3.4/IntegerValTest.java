/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@164.com & yyb zgsoft_happy@126.com
 * @version 1.0
 */
public class IntegerValTest
{
	public static void main(String[] args)
	{
		//下面代码是正确的，系统会自动把56当成byte类型处理
		byte a = 56;
		/*
		下面代码是错误的，系统不会把9999999999999当成long类型处理，
		所以超出int的表数范围，从而引起错误
		*/
		//long bigValue = 9999999999999;
		//下面代码是正确的，在巨大的整数常量后使用L后缀，强制使用long类型
		long bigValue2 = 9223372036854775807L;
		
		
		//以0开头的整数常量是八进制的整数
		int octalValue = 013;
		//以0x或0X开头的整数常量是十六进制的整数
		int hexValue1 = 0x13;
		int hexValue2 = 0XaF;
		
		
		//定义两个8位的二进制整数
		int binValue1 = 0b11010100;
		byte binValue2 = 0b01101001;
		//定义一个32位的二进制整数，最高位是符号位
		int binValue3 = 0B10000000000000000000000000000011;
		System.out.println(binValue1);	//输出212
		System.out.println(binValue2);	//输出105
		System.out.println(binValue3);	//输出-2147483645
		
		
		/*
		定义一个32位的二进制整数，该数值默认占32位，因此他是一个正数。
		只是强制类型转换成byte时产生了溢出，最终导致binValue4变成了-23
		*/
		byte binValue4 = (byte)0b11101001;
		/*
		定义一个32位的二进制整数，最高位是符号位。
		但由于数值后添加了L后缀，因此该整数实际占64为，第32位的1不是符号位。
		因此binValue5的值等于2的31次方 + 2 + 1
		*/
		long binValue5 = 0B10000000000000000000000000000011L;
		System.out.println(binValue4);	//输出-23
		System.out.println(binValue5);	//输出2147483651
	}
}