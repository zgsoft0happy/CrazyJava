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
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;
import java.awt.*;
public class ZoomImage
{
	//������������������С��ͼƬ�Ĵ�С
	private final int WIDTH = 80;
	private final int HEIGHT = 60;
	//����һ��BuffereddImage�������ڱ�����С���λͼ
	BufferedImage image = new BufferedImage(WIDTH , HEIGHT , BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	public void zoom() throws Exception
	{
		//��ȡԭʼλͼ
		Image srcImage = ImageIO.read(new File("image/board.jpg"));
		//��ԭʼλͼ��С����Ƶ�image������
		g.drawImage(srcImage , 0 , 0 , WIDTH , HEIGHT , null);
		//��image��������������ļ���
		ImageIO.write(image , "jpeg" , new File(System.currentTimeMillis() + ".jpg"));
	}
	public static void main(String[] args) throws Exception
	{
		new ZoomImage().zoom();
	}
}