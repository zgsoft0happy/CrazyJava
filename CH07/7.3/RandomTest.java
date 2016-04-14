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
		//����0.0~.10֮���α���double��
		System.out.println("rand.nextDouble()��" + rand.nextDouble());
		//����0.0~1.0֮���α���float��
		System.out.println("rand.nextFloat(): " +rand.nextFloat());
		//����ƽ��ֵ��0.0����׼����1.0��α��˹��
		System.out.println("rand.nextGaussian(): " + rand.nextGaussian());
		//����һ������int����ȡֵ��Χ��α�������
		System.out.println("rand.nextInt(): " + rand.nextInt());
		//����0~26֮���α�������
		System.out.println("rand.nextInt(26): " + rand.nextInt(26));
		//����һ������long����ȡֵ��Χ��α�������
		System.out.println("rand.nextLong(): " + rand.nextLong());
	}
}