/**
 * description：
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author  yyb zgsoft_happy@126.com
 * @version 1.0
 * 老师类信息以及行为
 */
public class Teacher
{
	/**
	 * 教师工号
	 */
	private String teachNum;
	/**
	 * 教师姓名
	 */
	private String name;
	/**
	 * 教师学科
	 */
	private String subject;
	
	/**
	 * 设置教师工号
	 */
	public void setTeachNum(String teachNum){
		this.teachNum = teachNum;
	}
	
	/**
	 * 获得教师工号
	 */
	public String getTeachNum(){
		return teachNum;
	}
	
	/**
	 * 设置教师姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 获得教师姓名
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 设置教师学科
	 */
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	/**
	 * 获得教师学科
	 */
	public String getSubject(){
		return subject;
	}
	
	/**
	 * 获得教师的所有信息的字符串形式
	 */
	public String toString(){
		return "工号：" + getTeachNum() + "，姓名：" + getName() + "，学科：" + getSubject();
	}
}
