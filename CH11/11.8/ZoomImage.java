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
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;
import java.awt.*;
public class ZoomImage
{
	//下面两个常量设置缩小后图片的大小
	private final int WIDTH = 80;
	private final int HEIGHT = 60;
	//定义一个BuffereddImage对象，用于保存缩小后的位图
	BufferedImage image = new BufferedImage(WIDTH , HEIGHT , BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	public void zoom() throws Exception
	{
		//读取原始位图
		Image srcImage = ImageIO.read(new File("image/board.jpg"));
		//将原始位图缩小后绘制到image对象中
		g.drawImage(srcImage , 0 , 0 , WIDTH , HEIGHT , null);
		//将image对象输出到磁盘文件中
		ImageIO.write(image , "jpeg" , new File(System.currentTimeMillis() + ".jpg"));
	}
	public static void main(String[] args) throws Exception
	{
		new ZoomImage().zoom();
	}
}