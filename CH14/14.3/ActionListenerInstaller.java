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
import java.lang.reflect.*;
import java.awt.event.*;
import javax.swing.*;
public class ActionListenerInstaller
{
	//����Annotation�ķ���������obj�ǰ���Annotation�Ķ���
	public static void processAnnotations(Object obj)
	{
		try
		{
			//��ȡobj�������
			Class cl = obj.getClass();
			//��ȡָ��obj���������Field��������ÿ��Field
			for(Field f : cl.getDeclaredFields())
			{
				//��ָ��Field���óɿ����ɷ���
				f.setAccessible(true);
				//��ȡָ��Field��ActionListenerFor���͵�Annotation
				ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
				//��ȡf Fieldʵ�ʶ�Ӧ�Ķ���
				Object fObj = f.get(obj);
				//���f��AbstractButton��ʵ������a��Ϊnull
				if(a != null && fObj != null && fObj instanceof AbstractButton)
				{
					//��ȡaע�����Ԫ����listener(����һ����������)
					Class<? extends ActionListener> listenerClazz = a.listener();
					//ʹ�÷���������listener��Ķ���
					ActionListener al = listenerClazz.newInstance();
					AbstractButton ab = (AbstractButton)fObj;
					//Ϊab��ť����¼�������
					ab.addActionListener(al);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}