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
import java.util.Arrays;
import java.util.List;
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("���Java����" , "������Java EE��ҵӦ��ʵս");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//����fixedList�ļ���Ԫ��
		for (int i = 0 ; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupportedOperationException�쳣
		fixedList.add("���Android����");
		fixedList.remove("���Java����");
	}
}