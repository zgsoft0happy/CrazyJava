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
 * ѧ���࣬��Ҫ����ѧ����һЩ״̬��Ϣ����Ϊ��
 */
public class Student
{
	/**
	 *	ѧ��ѧ��
	 */
	private String stuNum;
	/**
	 * ѧ������
	 */
	private String name;
	/**
	 * ѧ������
	 */
	private int age;
	/**
	 * ѧ���༶
	 */
	private ClassRoom classRoom;
	/**
	 * ѧ����ʦ
	 */
	private Teacher teacher;
	
	/**
	 * ��ȡѧ����ѧ����Ϣ
	 */
	public String getStuNum(){
		return stuNum;
	}
	
	/**
	 * ����ѧ����ѧ����Ϣ
	 */
	public void setStuNum(String stuNum){
		this.stuNum = stuNum;
	}
	
	/**
	 * ����ѧ������
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * ��ȡѧ��������Ϣ
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * ����ѧ��������Ϣ
	 */
	public void setAge(int age){
		this.age = age;
	}
	
	/**
	 * ���ѧ����������Ϣ
	 */
	public int getAge(){
		return age;
	}
	
	/**
	 * ����ѧ������ʦ
	 */
	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}
	
	/**
	 * ���ѧ������ʦ����
	 */
	public Teacher getTeacher(){
		return teacher;
	}
	
	/**
	 * ����ѧ���İ༶��Ϣ
	 */
	public void setClassRoom(ClassRoom classRoom){
		this.classRoom = classRoom;
	}
	
	/**
	 * ��ȡѧ���Ľ��Ҷ���
	 */
	public ClassRoom getClassRoom(){
		return classRoom;
	}
	
	/**
	 * ��ø�ѧ�������������Ϣ���ַ���
	 */
	public String toString(){
		return "ѧ�ţ�" + getStuNum() + "��������" + getName() + "�����䣺" +
			getAge() + "����ʦ��" + getTeacher() + "���༶��" + getClassRoom();
	}
}