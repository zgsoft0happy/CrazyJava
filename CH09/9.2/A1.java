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
public class A1 extends Apple<String>
{
	//��ȷ��д�˸���ķ���������ֵ
	//�븸��Apple<String>�ķ���ֵ��ȫ��ͬ
	public String getInfo()
	{
		return "����" + super.getInfo();
	}
	/*
	//����ķ����Ǵ���ģ���д���෽��ʱ����ֵ���Ͳ�һ��
	public Object getinfo()
	{
		return "����";
	}
	*/
}