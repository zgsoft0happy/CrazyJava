/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-03-30
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
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
		//������һ���̵߳ķ�ʽ��ִ��һ����ʱ������
		final Thread targetThread = new Thread(target);
		targetThread.start();
		final ProgressMonitor dialog = new ProgressMonitor(null ,
			"�ȴ��������" , "�����: " , 0 , target.getAmount());
		timer = new Timer(300 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//������ĵ�ǰ��������ý��Ӷ��������ɱ���
				dialog.setProgress(target.getCurrent());
				//����û������˽��ȶԻ����еġ�ȡ������ť
				if (dialog.isCanceled())
				{
					//ֹͣ��ʱ��
					timer.stop();
					//�ж������ִ���߳�
					targetThread.interrupt();	//1
					//ϵͳ�˳�
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