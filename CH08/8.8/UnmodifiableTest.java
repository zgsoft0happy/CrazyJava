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
import java.util.*;
public class UnmodifiableTest
{
	public static void main(String[] args)
	{
		//����һ���յġ����ɸı��List����
		List unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�ء��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("���Java����");
		//����һ����ͨ��Map����
		Map scores = new HashMap();
		scores.put("����" , 80);
		scores.put("Java" , 82);
		//������ͨ��Map�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д��붼������UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");		//1
		unmodifiableSet.add("����Ԫ��"); 		//2
		unmodifiableMap.put("����" , 90);		//3
	}
}