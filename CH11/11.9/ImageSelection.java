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
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import javax.swing.*;
public class ImageSelection implements Transferable
{
	private Image image;
	//构造器，负责持有一个Image对象
	public ImageSelection(Image image)
	{
		this.image = image;
	}
	//返回该Transferable对象所支持的所有DataFlavor
	public DataFlavor[] getTransferDataFlavors()
	{
		return new DataFlavor[]{DataFlavor.imageFlavor};
	}
	//取出该Transferable对象里实际的数据
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException
	{
		if (flavor.equals(DataFlavor.imageFlavor))
		{
			return image;
		}
		else 
		{
			throw new UnsupportedFlavorException(flavor);
		}
	}
	//返回该Transferable对象是否支持制定的DataFlavor
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.equals(DataFlavor.imageFlavor);
	}
}