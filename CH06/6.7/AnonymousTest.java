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
interface Product
{
	public double getPrice();
	public String getName();
}
public class AnonymousTest
{
	public void test(Product p)
	{
		System.out.println("������һ��" + p.getName() +"��������" + p.getPrice());
	}
	public static void main(String[] args)
	{
		AnonymousTest ta = new AnonymousTest();
		//����test����ʱ����Ҫ����һ��Product����
		//�˴�����������ʵ�����ʵ��
		ta.test(new Product()
		{
			public double getPrice()
			{
				return 567.8;
			}
			public String getName()
			{
				return "AGP�Կ�";
			}
		});
	}
}