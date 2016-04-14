/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-30
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProgressMonitorTest
{
	Timer timer;
	public void init()
	{
		final SimulatedActivity target = new SimulatedActivity(1000);
		//以启动一条线程的方式来执行一个耗时的任务
		final Thread targetThread = new Thread(target);
		targetThread.start();
		final ProgressMonitor dialog = new ProgressMonitor(null ,
			"等待任务完成" , "已完成: " , 0 , target.getAmount());
		timer = new Timer(300 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//以任务的当前完成量设置进队都画框的完成比例
				dialog.setProgress(target.getCurrent());
				//如果用户单击了进度对话框中的“取消”按钮
				if (dialog.isCanceled())
				{
					//停止计时器
					timer.stop();
					//中断任务的执行线程
					targetThread.interrupt();	//1
					//系统退出
					System.exit(0);
				}
			}
		});
		timer.start();
	}
	public static void main(String[] args)
	{
		new ProgressMonitorTest().init();
	}
}