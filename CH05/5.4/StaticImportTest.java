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
import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImportTest
{
	public static void main(String[] args)
	{
		//out��java.lang.System��ľ�̬Field�������׼���
		//PI��java.lang.Math��ľ�̬Field����ʾ�г���
		out.println(PI);
		//ֱ�ӵ���Math���sqrt��̬����
		out.println(sqrt(256));
	}
}