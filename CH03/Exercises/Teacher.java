/**
 * description��
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author  yyb zgsoft_happy@126.com
 * @version 1.0
 * ��ʦ����Ϣ�Լ���Ϊ
 */
public class Teacher
{
	/**
	 * ��ʦ����
	 */
	private String teachNum;
	/**
	 * ��ʦ����
	 */
	private String name;
	/**
	 * ��ʦѧ��
	 */
	private String subject;
	
	/**
	 * ���ý�ʦ����
	 */
	public void setTeachNum(String teachNum){
		this.teachNum = teachNum;
	}
	
	/**
	 * ��ý�ʦ����
	 */
	public String getTeachNum(){
		return teachNum;
	}
	
	/**
	 * ���ý�ʦ����
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * ��ý�ʦ����
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * ���ý�ʦѧ��
	 */
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	/**
	 * ��ý�ʦѧ��
	 */
	public String getSubject(){
		return subject;
	}
	
	/**
	 * ��ý�ʦ��������Ϣ���ַ�����ʽ
	 */
	public String toString(){
		return "���ţ�" + getTeachNum() + "��������" + getName() + "��ѧ�ƣ�" + getSubject();
	}
}
