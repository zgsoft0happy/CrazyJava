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
public abstract class SpeedMeter
{
	//转速
	private double turnRate;
	public SpeedMeter()
	
	{
	}
	//把返回车轮半径的方法定义成抽象方法
	public abstract double getRadius();
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	//定义计算速度的通用方法
	public double getSpeed()
	{
		//速度等于 车轮半径 * 2 * PI * 转速
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}