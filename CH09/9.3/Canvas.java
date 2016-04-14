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
import java.util.List;
/*
public class Canvas
{
	//同时在画布上绘制多个形状
	public void drawAll(List<Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}
}
*/
/*
public class Canvas
{
	//同时在画布上绘制多个形状
	public void drawAll(List<?> shapes)
	{
		for (Objecct obj : shapes)
		{
			Shape s = (Shape)obj;
			s.draw(this);
		}
	}
}
*/
public class Canvas
{
	//同时在画布上绘制多个形状，使用被限制的泛型通配符
	public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}
}