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
import java.util.Set;
import java.util.HashSet;
public class SetTest
{
	public static void main(String[]  args)
	{
		Set books = new HashSet();
		//���һ���ַ�������
		books.add(new String("���Java����"));
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ����
		//�������ʧ�ܣ�����false
		boolean result = books.add(new String("���Java����"));
		//�����������������ֻ��һ��Ԫ��
		System.out.println(result + "-->" + books);
	}
}