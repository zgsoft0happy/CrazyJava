/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-06  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.io.*;
public class InsertContent
{
	public static void insert(String fileName , long pos , String insertContent) throws IOException
	{
		File tmp = File.createTempFile("tmp" , null);
		tmp.deleteOnExit();
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName , "rw");
			//使用临时文件来保存插入点后的数据
			FileOutputStream tmpOut = new FileOutputStream(tmp);
			FileInputStream tmpIn = new FileInputStream(tmp))
		{
			raf.seek(pos);
			//----下面代码将插入点后的内容读入临时文件中保存----
			byte[] bbuf = new byte[64];
			//用于保存实际读取的字节数
			int hasRead = 0;
			//使用循环方式读取插入点后的数据
			while ((hasRead = raf.read(bbuf)) > 0)
			{
				//将读取的数据写入临时文件
				tmpOut.write(bbuf , 0 , hasRead);
			}
			//----下面代码用于插入内容-----
			//把文件记录指针重新定位到pos位置
			raf.seek(pos);
			//追加需要插入的内容
			raf.write(insertContent.getBytes());
			//追加临时文件中的内容
			while ((hasRead = tmpIn.read(bbuf)) > 0)
			{
				raf.write(bbuf , 0 , hasRead);
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		insert("InsertContent.java" , 45 , "插入的内容\r\n");
	}
}