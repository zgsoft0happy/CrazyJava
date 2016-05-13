/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-13  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.net.*;
public class DownUtil
{
	//定义下载资源的路径
	private String path;
	//指定所下载的文件的保存位置
	private String targetFile;
	//定义需要使用多少个线程下载资源
	private int threadNum;
	//定义下载的线程对象
	private DownThread[] threads;
}