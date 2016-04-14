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
import java.util.*;
import java.text.MessageFormat;
public class HelloArg
{
	public static void main(String[] args)
	{
		//����һ��Locale����
		Locale currentLocale = null;
		//������г���ָ������������
		if (args.length == 2)
		{
			//ʹ�����г����������������Localeʵ��
			currentLocale = new Locale(args[0] , args[1]);
		}
		else
		{
			//����ֱ��ʹ��ϵͳĬ�ϵ�Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//����Locale����������Դ
		ResourceBundle bundle = ResourceBundle.getBundle("myMess" , currentLocale);
		//ȡ���Ѽ��ص�������Դ�ļ���msg��Ӧ��Ϣ
		String msg = bundle.getString("msg");
		//ʹ��MessageFormatΪ��ռλ�����ַ����������
		System.out.println(MessageFormat.format(msg , "yeeku" , new Date()));
	}
}