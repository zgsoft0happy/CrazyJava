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
import java.util.Map;
import java.util.HashMap;
public class DiamondTest
{
	public static void main(String[] args)
	{
		//Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> books = new ArrayList<>();
		books.add("���Java����");
		books.add("���Android����");
		books.add("������Java EE��ҵӦ��ʵս");
		//����ʱ����Ԫ�ؾ���String
		for (String book : books)
		{
			System.out.println(book);
		}
		//Java�Զ��ƶϳ�HashMap��<>��Ӧ����String��List<String>
		Map<String , List<String>> schoolsInfo = new HashMap<>();
		//Java�Զ��ƶϳ�ArrayList��<>Ӧ����STring
		List<String> schools = new ArrayList<>();
		schools.add("б�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����" , schools);
		//����Mapʱ��Map��key��String����
		for (String key : schoolsInfo.keySet())
		{
			//value��List<String>����
			List<String> list = schoolsInfo.get(key);
			System.out.println(key + "-->" + list);
		}
	}
}