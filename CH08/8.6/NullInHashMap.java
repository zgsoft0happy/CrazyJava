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
import java.util.HashMap;
public class NullInHashMap
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		//��ͼ������keyΪnullֵ��key-value�Է���HashMap��
		hm.put(null , null);
		hm.put(null , null);	//1
		//��һ��valueΪnullֵ��key-value�Է���HashMap��
		hm.put("a" , null);		//2
		//���Map����
		System.out.println(hm);
	}
}