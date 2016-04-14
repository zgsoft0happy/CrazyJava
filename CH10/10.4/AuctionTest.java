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
public class AuctionTest
{
	private double initPrice = 30.0;
	//因为该方法中显式抛出了AuctionException异常
	//所以此处需要声明抛出AuctionException异常
	public void bid(String bidPrice) throws AuctionException
	{
		double d = 0.0;
		try
		{
			d = Double.parseDouble(bidPrice);
		}
		catch (Exception e)
		{
			//此处完成本方法中可以对异常执行的修复处理
			//此处仅仅是在控制台打出一场的跟踪栈信息
			e.printStackTrace();
			//再次抛出自定义异常
			throw new AuctionException("竞拍价必须是数值，不能包含其他字符！");
		}
		if (initPrice > d)
		{
			throw new AuctionException("竞拍价比起拍价低，不允许竞拍！");
		}
		initPrice = d;
	}
	public static void main(String[] args)
	{
		AuctionTest at = new AuctionTest();
		try
		{
			at.bid("df");
		}
		catch (AuctionException ae)
		{
			//再次捕获到bid方法中的异常，并对该异常进行处理
			System.out.println(ae.getMessage());
		}
	}
}