/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-13  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.net.*;
public class URLDecoderTest
{
	public static void main(String[] args) throws Exception
	{
		//��application/x-www-form-urlencoded�ַ���
		//ת������ͨ�ַ���
		//���е��ַ���ֱ�Ӵ�ͼ17.3��ʾ�Ĵ����и��ƹ���
		String keyWord = URLDecoder.decode("%B7%E8%BF%F1java" , "GBK");
		System.out.println(keyWord);
		//����ͨ�ַ���ת����
		//application/x-www-form-urlencoded�ַ���
		String urlStr = URLEncoder.encode("���Android����" , "GBK");
		System.out.println(urlStr);
	}
}