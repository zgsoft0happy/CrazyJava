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
import java.util.EnumMap;
enum Season
{
	SPRING , SUMMER , FALL , WINTER
}
public class EnumMapTest
{
	public static void main(String[] args)
	{
		//����һ��EnumMap���󣬸�EnumMap������key
		//������Seasonö�����ö��ֵ
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER , "��������");
		enumMap.put(Season.SPRING , "��ů����");
		System.out.println(enumMap);
	}
}