/**
 * description£º
 * <br/>ÍøÕ¾£º<a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>CSDNÖ÷Ò³£º<a href="http://my.csdn.net/y1193329479">CSDNÖ÷Ò³</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date:
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * »­½üËÆÔ²
 */
public class PrintCircle
{
	public static void main(String[] args){
		new PrintCircle().printCircle(10);
	}
	public void printCircle(int r){
		for(int i = r;i >2;i--){
			int l1 = (int)Math.sqrt(r*r-i*i);
			int d1 = r - l1-1;
			for(int j = 0;j<d1;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0;j<2*l1;j++){
				System.out.print(" ");
			}
			System.out.println("*");	
		}
		for(int i = 3;i<=r;i++){
			int l1 = (int)Math.sqrt(r*r-i*i);
			int d1 = r - l1-1;
			for(int j = 0;j<d1;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0;j<2*l1;j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}
}
 