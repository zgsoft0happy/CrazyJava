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
import java.util.Objects;
public class ObjectsTest
{
	//����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest obj;
	public static void main(String[] args)
	{
		//���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toString�����null
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull�����objΪnull�������쳣
		System.out.println(Objects.requireNonNull(obj , "obj����������null!"));
	}
}