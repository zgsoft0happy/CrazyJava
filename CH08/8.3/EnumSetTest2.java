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
import java.util.EnumSet;
import java.util.Collection;
import java.util.HashSet;
public class EnumSetTest2
{
	public static void main(String[] args)
	{
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		//����Collection�����е�����Ԫ��������EnumSet����
		EnumSet enumSet = EnumSet.copyOf(c);	//1
		//���[SPRING,FALL]
		System.out.println(enumSet);
		c.add("���Java����");
		c.add("������Java EE��ҵӦ��ʵս");
		//�����������쳣����Ϊc�������Ԫ�ز���ȫ����Ϊö��ֵ
		enumSet = EnumSet.copyOf(c);	//2
	}
}