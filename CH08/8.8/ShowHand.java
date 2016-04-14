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
import java.util.LinkedList;
import java.util.Collections;
public class ShowHand
{
	//�������Ϸ���֧�ֶ��ٸ����
	private final int PLAY_NUM = 5;
	//�����˿��Ƶ����л�ɫ����ֵ
	private String[] types = {"����" , "�ݻ�" , "����" , "����"};
	private String[] values = {"2" , "3" , "4" , "5" , "6" , "7" , "8" ,
		"9" , "10" , "J" , "Q" , "K" , "A"};
	//cards��һ����Ϸ��ʣ�µ��˿���
	private List<String> cards = new LinkedList<String>();
	//�������е����
	private String[] players = new String[PLAY_NUM];
	//����������ϵ��˿���
	private List<String>[] playersCards = new List[PLAY_NUM];
	/**
	 * ��ʼ���˿��ƣ�����52���˿���
	 * ����ʹ��shuffle���������ǰ����˳������
	 */
	public void initCards()
	{
		for (int i = 0 ; i < types.length ; i++)
		{
			for (int j = 0 ; j < values.length ; j++)
			{
				cards.add(types[i] + values[j]);
			}
		}
		//�������
		Collections.shuffle(cards);
	}
	/**
	 * ��ʼ����ң�Ϊÿ����ҷ����û���
	 */
	public void initPlayer(String... names)
	{
		if (names.length > PLAY_NUM || names.length < 2)
		{
			//У������������˴�ʹ���쳣���Ƹ�����
			System.out.println("�����������");
			return ;
		}
		else 
		{
			//��ʼ������û���
			for (int i = 0 ; i < names.length ; i++)
			{
				players[i] = names[i];
			}
		}
	}
	/**
	 * ��ʼ��������ϵ��˿��ƣ���ʼ��Ϸʱÿ��������ϵ��˿���Ϊ��
	 * ����ʹ��һ������Ϊ0��LinkedList����ʾ
	 */
	public void initPlayerCards()
	{
		for (int i = 0 ; i < players.length ; i++)
		{
			if (players[i] != null && !players[i].equals(""))
			{
				playersCards[i] = new LinkedList<String>();
			}
		}
	}
	/**
	 * ���ȫ���˿��ƣ��÷���û��ʵ�����ã�����������
	 */
	public void showAllCards()
	{
		for (String card : cards)
		{
			System.out.println(card);
		}
	}
	/**
	 * ���˿���
	 * @param first �����ɸ�˭
	 */
	public void deliverCard(String first)
	{
		//����ArrayUtils�������search����
		//��ѯ��ָ��Ԫ���������е�����
		int firstPos = ArrayUtils.search(players , first);
		//���θ�λ�ڸ�ָ�����֮���ÿ��������˿���
		for (int i = firstPos ; i < PLAY_NUM ; i++)
		{
			if (players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
		//���θ�λ�ڸ�ָ�����֮ǰ��ÿ��������˿���
		for (int i = 0 ; i < firstPos ; i++)
		{
			if (players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}
	/**
	 * ���������ϵ��˿���
	 * ʵ�ָ÷���ʱ��Ӧ�ÿ���ÿ����ҿ��������˵ĵ�һ���ƣ����˴�û�����Ӹù���
	 */
	public void showPlayerCards()
	{
		for (int i = 0 ; i < PLAY_NUM ; i++)
		{
			//������Ҳ�λ��ʱ
			if (players[i] != null)
			{
				//������
				System.out.println(players[i] + "��");
				//�������������ϵ��˿���
				for (String card : playersCards[i])
				{
					System.out.println(card + "\t");
				}
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args)
	{
		ShowHand sh = new ShowHand();
		sh.initPlayer("�������" , "�����");
		sh.initCards();
		sh.initPlayerCards();
		//������������˿��ƣ�û��ʵ������
		sh.showAllCards();
		System.out.println("---------------");
		//����ӡ�����ա���ʼ����
		sh.deliverCard("�����");
		sh.showPlayerCards();
		/*
		����ط���Ҫ���Ӵ���
		1. �������������ע
		2. ��������Ƿ��ע
		3. ��Ϸ�Ƿ�ֻʣ��һ����ң�����ǣ�������ʤ����
		4. ����Ѿ������һ���˿��ƣ�����Ҫ�Ƚ�ʣ����ҵ������С
		*/
		//�ٴδӡ�������ҡ���ʼ����
		sh.deliverCard("�������");
		sh.showPlayerCards();
	}
}