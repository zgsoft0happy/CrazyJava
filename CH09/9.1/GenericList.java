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
import java.util.ArrayList;
public class GenericList
{
	public static void main(String[] args)
	{
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();		//1
		strList.add("���Java����");
		strList.add("���Android����");
		strList.add("������Java EE��ҵӦ��ʵս");
		//������뽫����������
		strList.add(5);		//2
		for (int i = 0 ; i < strList.size() ; i++)
		{
			//��������������ǿ������ת��
			String str = strList.get(i);		//3
		}
	}
}