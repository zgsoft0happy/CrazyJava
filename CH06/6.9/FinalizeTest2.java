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
public class FinalizeTest2
{
	private static FinalizeTest2 ft = null;
	public void info()
	{
		System.out.println("������Դ�����finalize����");
	}
	public static void main(String[] args) throws Exception
	{
		//����TestFinalize������������ָ�״̬
		new FinalizeTest2();
		//֪ͨϵͳ������Դ����
		System.gc();
		//ǿ���������ջ��Ƶ��ÿɻָ������finalize����
		Runtime.getRuntime().runFinalization();		//1
		//System.runFinalization();		//2
		ft.info();
	}
	public void finalize()
	{
		
		//��ft���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�״̬
		ft = this;
	}
}