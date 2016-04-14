/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * 学生类，主要介绍学生的一些状态信息和行为。
 */
public class Student
{
	/**
	 *	学生学号
	 */
	private String stuNum;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生年龄
	 */
	private int age;
	/**
	 * 学生班级
	 */
	private ClassRoom classRoom;
	/**
	 * 学生老师
	 */
	private Teacher teacher;
	
	/**
	 * 获取学生的学号信息
	 */
	public String getStuNum(){
		return stuNum;
	}
	
	/**
	 * 设置学生的学号信息
	 */
	public void setStuNum(String stuNum){
		this.stuNum = stuNum;
	}
	
	/**
	 * 设置学生姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 获取学生姓名信息
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 设置学生年龄信息
	 */
	public void setAge(int age){
		this.age = age;
	}
	
	/**
	 * 获得学生的年龄信息
	 */
	public int getAge(){
		return age;
	}
	
	/**
	 * 设置学生的老师
	 */
	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}
	
	/**
	 * 获得学生的老师对象
	 */
	public Teacher getTeacher(){
		return teacher;
	}
	
	/**
	 * 设置学生的班级信息
	 */
	public void setClassRoom(ClassRoom classRoom){
		this.classRoom = classRoom;
	}
	
	/**
	 * 获取学生的教室对象
	 */
	public ClassRoom getClassRoom(){
		return classRoom;
	}
	
	/**
	 * 获得该学生对象的所有信息的字符串
	 */
	public String toString(){
		return "学号：" + getStuNum() + "，姓名：" + getName() + "，年龄：" +
			getAge() + "，老师：" + getTeacher() + "，班级：" + getClassRoom();
	}
}