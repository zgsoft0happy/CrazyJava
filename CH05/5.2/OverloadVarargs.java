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
public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("ֻ��һ���ַ���������test����");
	}
	//��Ϊǰ���Ѿ�����һ��test������test��������һ���ַ�������
	//�˴��ĳ��ȿɱ��β���������һ���ַ�����������ʽ
	public void test(String...books)
	{
		System.out.println("****�βγ��ȿɱ��test����****");
	}
	public static void main(String[] args)
	{
		OverloadVarargs olv = new OverloadVarargs();
		//�������ε��ý�ִ�еڶ���test����
		olv.test();
		olv.test("aa","bb");
		//������ý�ִ�е�һ��test����
		olv.test("aa");
		//������ý�ִ�еڶ���test����
		olv.test(new String[]{"aa"});
	}
}