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
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
public class PhantomReferenceTest
{
	public static void main(String[] args) throws Exception
	{
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ������Java���塰�ַ���
		PhantomReference pr = new PhantomReference(str , rq);
		//�ж�str���ú͡����Java���塰�ַ���֮�������
		str = null;
		//ȡ�������������õĶ���
		//������ͨ�������ñ����õĶ������Դ˴����null
		System.out.println(pr.get());		//1
		//ǿ����������
		System.gc();
		System.runFinalization();
		//��������֮�������ý����������ö�����
		//ȡ�����ö��������Ƚ�����е�������pr���бȽ�
		System.out.println(rq.poll()  == pr);		//2
	}
}