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
public class Gobang
{
	String inputStr = null;
	//br.readLine():ÿ���ڼ���������һ������ʱ���س���
	//����������ݽ���br��ȡ��
	while ((inputStr = br.readLine()) != null)
	{
		try
		{
			//���û�������ַ����Զ�����Ϊ�ָ������ֽ��2���ַ���
			String[] posStrArr = inputStr.split(",");
			//��2���ַ���ת�����û����������
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			//�Ѷ�Ӧ������Ԫ�ظ�Ϊ"O"
			if (!gb.board[xPos - 1][yPos - 1].equals("+"))
			{
				System.out.println("���������������������ˣ�"
					+ "����������");
				continue;
			}
			gb.board[xPos - 1][yPos - 1] = "O";
		}
		catch(Exception e)
		{
			System.out.println("����������겻�Ϸ������������룬"
				+ "��������Ӧ��x,y�ĸ�ʽ");
			continue;
		}
		//...
	}
}