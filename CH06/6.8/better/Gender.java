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
public enum Gender
{
	MALE , FEMALE;
	private String name;
	public void setName(String name)
	{
		switch (this)
		{
			case MALE:
				if (name.equals("��"))
				{
					this.name = name;
				}
				else
				{
					System.out.println("��������");
					return ;
				}
				break;
			case FEMALE:
				if (name.equals("Ů"))
				{
					this.name = name;
				}
				else 
				{
					System.out.println("��������");
					return ;
				}
				break;
		}
	}
	public String getName()
	{
		return this.name;
	}
}