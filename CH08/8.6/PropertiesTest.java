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
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class PropertiesTest
{
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		//��Properties���������
		props.setProperty("username" , "yeeku");
		props.setProperty("password" , "123456");
		//��Properties�е�key-value�Ա�����a.ini�ļ���
		props.store(new FileOutputStream("a.ini") , "comment line");	//1
		//�½�һ��Properties����
		Properties props2 = new Properties();
		//��Properrties���������
		props2.setProperty("gender" , "male");
		//��a.ini�ļ��е�key-value��׷�ӵ�props2��
		props2.load(new FileInputStream("a.ini"));	//2
		System.out.println(props2);
	}
}