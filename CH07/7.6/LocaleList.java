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
import java.util.Locale;
public class LocaleList
{
	public static void main(String[] args)
	{
		//����Java��֧�ֵ�ȫ�����Һ����Ե�����
		Locale[] localeList = Locale.getAvailableLocales();
		//���������ÿ��Ԫ�أ����λ�ȡ��֧�ֵĹ��Һ�����
		for (int i = 0 ; i < localeList.length ; i++)
		{
			//�����֧�ֵĹ��Һ�����
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry() + " "
				+ localeList[i].getDisplayLanguage()
				+ "=" + localeList[i].getLanguage());
		}
	}
}