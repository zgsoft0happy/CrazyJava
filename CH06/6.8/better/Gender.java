/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
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
				if (name.equals("男"))
				{
					this.name = name;
				}
				else
				{
					System.out.println("参数错误");
					return ;
				}
				break;
			case FEMALE:
				if (name.equals("女"))
				{
					this.name = name;
				}
				else 
				{
					System.out.println("参数错误");
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