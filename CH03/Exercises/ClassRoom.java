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
 * �༶��Ϣ
 */
public class ClassRoom
{
	/**
	 * ���ұ��
	 */
	private String roomNum;
	/**
	 * �༶����
	 */
	private String className;
	
	/**
	 * ���ý��ұ��
	 */
	public void setRoomNum(String roomNum){
		this.roomNum = roomNum;
	}
	
	/**
	 * ��ý��ұ��
	 */
	public String getRoomNum(){
		return roomNum;
	}
	
	/**
	 * ���ð༶����
	 */
	public void setClassName(String className){
		this.className = className;
	}
	
	/** 
	 * ��ð༶����
	 */
	public String getClassName(){
		return className;
	}
	
	/**
	 * ��ð༶��������Ϣ���ַ���
	 */
	public String toString(){
		return "�༶���ƣ�" + getClassName() + "�����ұ�ţ�" + getRoomNum();
	}
}