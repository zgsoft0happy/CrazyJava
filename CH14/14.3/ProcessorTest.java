/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import  java.lang.reflect.*;
public class ProcessorTest
{
	public static void process(String clazz) throws ClassNotFoundException
	{
		int passed = 0;
		int failed = 0;
		//����clazz��Ӧ����������з���
		for (Method m : Class.forName(clazz).getMethods())
		{
			//����÷���ʹ����@Testable����
			if (m.isAnnotationPresent(Testable.class))
			{
				try
				{
					//����m����
					m.invoke(null);
					//passed��1
					passed++;
				}
				catch (Exception ex)
				{
					System.out.println("����" + m + "����ʧ�ܣ��쳣��" + ex.getCause());
					failed++;
				}
			}
		}
		//ͳ�Ʋ��Խ��
		System.out.println("�������ˣ�" + (passed + failed) + "�����������У�\n"
			+ "ʧ���ˣ�" + failed + "����\n�ɹ��ˣ�" + passed + "����");
	}
}