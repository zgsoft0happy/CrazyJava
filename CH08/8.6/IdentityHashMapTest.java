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
import java.util.IdentityHashMap;
public class IdentityHashMapTest
{
	public static void main(String[] args)
	{
		IdentityHashMap ihm = new IdentityHashMap();
		//�������д��뽫����IdentityHashMap�������������key-value��
		ihm.put(new String("����") , 89);
		ihm.put(new String("����") , 78);
		//�������д���ֻ����IdentityHashMap��������Ӱ�һ��key-value��
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}