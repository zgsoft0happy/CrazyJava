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
public class ListErr
{
	public static void main(String[] args)
	{
		//����һ��ֻ�뱣���ַ������͵�List����
		List strList = new ArrayList();
		strList.add("���Java����");
		strList.add("Ajax����");
		strList.add("������Java EE��ҵӦ��ʵս");
		//"��С��"��һ��Integer���󡰶������˼���
		strList.add(5);		//1
		for (int i = 0 ; i < strList.size() ; i++)
		{
			//��ΪList��ȡ����ȫ����Object�����Ա������ǿ������ת��
			//���һ��Ԫ�ؽ�����ClassCastException�쳣
			String str = (String)strList.get(i);	//2
		}
	}
}