/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-19
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.UIManager;
public class AllLookAndFeel
{
	public static void main(String[] args)
	{
		System.out.println("当前系统可用的所有LAF：");
		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		{
			System.out.println(info.getName() + "--->" + info);
		}
	}
}