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
import java.lang.ref.WeakReference;
public class ReferenceTest
{
	public static void main(String[] args) throws Exception
	{
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�������ã��ô����������õ������Java���塱�ַ���
		WeakReference wr = new WeakReference(str);		//1
		//�ж�str���ú͡����Java���塱�ַ���֮�������
		str = null; 	//2
		//ȡ�������������õĶ���
		System.out.println(wr.get());		//3
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());		//4
	}
}