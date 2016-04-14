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
public class Address
{
	private final String detail;
	private final String postCode;//
	//�ڹ��������ʼ��������ʵ��Field
	public Address()
	{
		this.detail = "";
		this.postCode = "";
	}
	public Address(String detail , String postCode)
	{
		this.detail = detail;
		this.postCode = postCode;
	}
	//��Ϊ����ʵ��Field�ṩgetter����
	public String getDetail()
	{
		return this.detail;
	}
	public String getPostCode()
	{
		return this.postCode;
	}
	//��дequals�������ж����������Ƿ����
	public boolean equals (Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == Address.class)
		{
			Address ad = (Address)obj;
			//��detail��postCode���ʱ������Ϊ����Address�������
			if (this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode()))
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return detail.hashCode() + postCode.hashCode() * 31;
	}
}