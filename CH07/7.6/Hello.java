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
import java.util.ResourceBundle;
public class Hello
{
	public static void main(String[] args)
	{
		//ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		//����ָ���Ĺ���/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("mess" , myLocale);
		//��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}
}