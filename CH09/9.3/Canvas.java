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
import java.util.List;
/*
public class Canvas
{
	//ͬʱ�ڻ����ϻ��ƶ����״
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
	//ͬʱ�ڻ����ϻ��ƶ����״
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
	//ͬʱ�ڻ����ϻ��ƶ����״��ʹ�ñ����Ƶķ���ͨ���
	public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}
}