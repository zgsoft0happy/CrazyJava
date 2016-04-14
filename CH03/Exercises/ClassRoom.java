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
 * 班级信息
 */
public class ClassRoom
{
	/**
	 * 教室编号
	 */
	private String roomNum;
	/**
	 * 班级名称
	 */
	private String className;
	
	/**
	 * 设置教室编号
	 */
	public void setRoomNum(String roomNum){
		this.roomNum = roomNum;
	}
	
	/**
	 * 获得教室编号
	 */
	public String getRoomNum(){
		return roomNum;
	}
	
	/**
	 * 设置班级名称
	 */
	public void setClassName(String className){
		this.className = className;
	}
	
	/** 
	 * 获得班级名称
	 */
	public String getClassName(){
		return className;
	}
	
	/**
	 * 获得班级的所有信息的字符串
	 */
	public String toString(){
		return "班级名称：" + getClassName() + "，教室编号：" + getRoomNum();
	}
}