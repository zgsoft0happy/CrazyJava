/**
 * <br/>网站：<a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>CSDN主页：<a href="http://my.csdn.net/y1193329479">CSDN主页</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description：
 */
import java.lang.annotation.*;
//使用JDK的元数据Annotation:@Retention
@Retention(RetentionPolicy.RUNTIME)
//使用JDK的元数据Annotation:@Target
@Target(ElementType.METHOD)
//定义一个标记注释，不包含任何成员变量，即不可传入元数据
public @interface Testable
{}