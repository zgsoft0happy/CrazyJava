/**
 * <br/>ÍøÕ¾£º<a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>CSDNÖ÷Ò³£º<a href="http://my.csdn.net/y1193329479">CSDNÖ÷Ò³</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description£º
 */
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Id
{
	String column();
	String type();
	String generator();
}