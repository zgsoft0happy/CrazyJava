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
public class IfTest
{
	public static void main(String[] args)
	{
		int age = 30;
		if(age > 20)
		//ֻ�е�age > 20ʱ�����滨�����������Ĵ����Ż�ִ��
		//�������������������һ�����壬Ҫôһ��ִ�У�Ҫôһ��ִ��
		{
			System.out.println("�����Ѿ�����20����");
			System.out.println("20�����ϵ���Ӧ��ѧ��е����Ρ���");
		}
		
		
		//�������a����Ϊ�丳ֵ
		int a = 5;
		if(a > 4)
			//���a > 4����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("a����4");
		else
			//����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("a������4");
			
		
		//�������b����Ϊ�丳ֵ
		int b = 5;
		if(b > 4)
			//���b > 4����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("b����4");
		else 
			//����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			b--;
			//��������Ĵ�����ԣ����Ѿ�����������ִ�е�һ���֣�����ܻ�ִ��
			System.out.println("b������4");
			
		
		//�������c����Ϊ�丳ֵ
		int c = 5;
		if(c > 4)
			//���c > 4����ִ�������ִ���壬��ֻ��c--;һ�д���Ϊִ����
			c--;
			//������һ����ͨ���룬������ִ����
			//System.out.println("c����4");
		//�˴���else��û��if��䣬��˱������
		else
			//����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����	
			System.out.println("c������4");
	}
}