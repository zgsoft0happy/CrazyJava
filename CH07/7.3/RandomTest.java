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
import java.util.Random;
public class RandomTest
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("rand.nextBoolean(): " + rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//生成0.0~.10之间的伪随机double数
		System.out.println("rand.nextDouble()：" + rand.nextDouble());
		//生成0.0~1.0之间的伪随机float数
		System.out.println("rand.nextFloat(): " +rand.nextFloat());
		//生成平均值是0.0，标准差是1.0的伪高斯数
		System.out.println("rand.nextGaussian(): " + rand.nextGaussian());
		//生成一个处于int整数取值范围的伪随机整数
		System.out.println("rand.nextInt(): " + rand.nextInt());
		//生成0~26之间的伪随机整数
		System.out.println("rand.nextInt(26): " + rand.nextInt(26));
		//生成一个处于long整数取值范围的伪随机整数
		System.out.println("rand.nextLong(): " + rand.nextLong());
	}
}