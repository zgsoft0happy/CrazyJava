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
public class Gobang
{
	String inputStr = null;
	//br.readLine():每当在键盘上输入一行内容时按回车键
	//刚输入的内容将被br读取到
	while ((inputStr = br.readLine()) != null)
	{
		try
		{
			//将用户输入的字符串以逗号作为分隔符，分解成2个字符串
			String[] posStrArr = inputStr.split(",");
			//将2个字符串转换成用户下棋的坐标
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			//把对应的数组元素赋为"O"
			if (!gb.board[xPos - 1][yPos - 1].equals("+"))
			{
				System.out.println("您输入的坐标点已有棋子了，"
					+ "请重新输入");
				continue;
			}
			gb.board[xPos - 1][yPos - 1] = "O";
		}
		catch(Exception e)
		{
			System.out.println("您输入的坐标不合法，请重新输入，"
				+ "下棋坐标应以x,y的格式");
			continue;
		}
		//...
	}
}