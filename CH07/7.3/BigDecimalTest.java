/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 */
import java.math.BigDecimal;
public class BigDecimalTest
{
	public static void main(String[] args)
	{
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("ʹ��String��ΪBigDecimal������������");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f1.divide(f2));
		System.out.println("ʹ��double��ΪBigDecimal����������");
		System.out.println("0.05 + 0.01 = " + f3.add(f2));
		System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f3.divide(f2));
	}
}