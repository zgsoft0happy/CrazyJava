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
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class Gobang
{
	//��������λͼ�ֱ�������̡����ӡ�����
	BufferedImage table;
	BufferedImage black;
	BufferedImage white;
	//������ƶ�ʱ��ѡ���
	BufferedImage selected;
	//�������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	//�������̿��߶��ٸ�����
	private final int TABLE_WIDTH = 535;
	private final int TABLE_HEIGHT = 536;
	//�����������������ֵ����������֮��ı���
	private final int RATE = TABLE_WIDTH / BOARD_SIZE;
	//�����������������ֵ����������֮���ƫ�ƾ���
	private final int X_OFFSET = 5;
	private final int Y_OFFSET = 6;
	//����һ����λ�������䵱����
	private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	//��������Ϸ�Ĵ���
	JFrame f = new JFrame("��������Ϸ");
	//��������Ϸ���̶�Ӧ��Canvas���
	ChessBoard chessBoard = new ChessBoard();
	//��ǰѡ�е������
	private int selectedX = -1;
	private int selectedY = -1;
	public void init() throws Exception
	{
		table = ImageIO.read(new File("image/board.jpg"));
		black = ImageIO.read(new File("image/black.gif"));
		white = ImageIO.read(new File("image/white.gif"));
		selected = ImageIO.read(new File("image/selected.gif"));
		//��ÿ��Ԫ�ظ�Ϊ"ʮ"��"ʮ"����û������
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for (int j = 0 ; j < BOARD_SIZE ; j++)
			{
				board[i][j] = "ʮ";
			}
		}
		chessBoard.setPreferredSize(new Dimension(TABLE_WIDTH , TABLE_HEIGHT));
		chessBoard.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				//���û�����¼�������ת�����������������
				int xPos = (int)((e.getX() - X_OFFSET) / RATE);
				int yPos = (int)((e.getY() - Y_OFFSET) / RATE);
				board[xPos][yPos] = "��";
				/*
				�����������������������Ϊ������������꣬����board����
				���漰��
				1.�������ĵ��Ѿ��������ˣ������ظ�����
				2.ÿ���������Ҫɨ��˭Ӯ��
				*/
				chessBoard.repaint();
			}
			//������˳��������󣬸�λѡ�е�����
			public void mouseExited(MouseEvent e)
			{
				selectedX = -1;
				selectedY = -1;
				chessBoard.repaint();
			}
		});
		chessBoard.addMouseMotionListener(new MouseMotionAdapter()
		{
			//������ƶ�ʱ���ı�ѡ�е������
			public void mouseMoved(MouseEvent e)
			{
				selectedX = (e.getX() - X_OFFSET) / RATE;
				selectedY = (e.getY() - Y_OFFSET) / RATE;
				chessBoard.repaint();
			}
		});
		f.add(chessBoard);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) throws Exception
	{
		Gobang gb = new Gobang();
		gb.init();
	}
	class ChessBoard extends JPanel
	{
		//��дJpanel��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			//��������������
			g.drawImage(table , 0 , 0 , null);
			//����ѡ�е�ĺ��
			if (selectedX >= 0 && selectedY >= 0)
				g.drawImage(selected , selectedX * RATE + X_OFFSET , selectedY * RATE + Y_OFFSET , null);
			//�������飬��������
			for (int i = 0 ; i < BOARD_SIZE ; i++)
			{
				for(int j = 0 ; j < BOARD_SIZE ; j++)
				{
					//���ƺ���
					if (board[i][j].equals("��"))
					{
						g.drawImage(black , i * RATE + X_OFFSET , j * RATE + Y_OFFSET , null);
					}
					//���ư���
					if (board[i][j].equals("��"))
					{
						g.drawImage(white , i * RATE + X_OFFSET , j * RATE + Y_OFFSET , null);
					}
				}
			}
		}
	}
}