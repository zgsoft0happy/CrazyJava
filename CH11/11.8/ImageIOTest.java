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
import javax.imageio.*;
public class ImageIOTest
{
	public static void main(String[] args)
	{
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("----Image能读的多有图形文件格式-----");
		for (String tmp : readFormat)
		{
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----Image能写的所有图形文件格式-----");
		for (String tmp : writeFormat)
		{
			System.out.println(tmp);
		}
	}
}