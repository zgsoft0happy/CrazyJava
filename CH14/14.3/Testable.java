/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-05-03  Locate:149
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.lang.annotation.*;
//ʹ��JDK��Ԫ����Annotation:@Retention
@Retention(RetentionPolicy.RUNTIME)
//ʹ��JDK��Ԫ����Annotation:@Target
@Target(ElementType.METHOD)
//����һ�����ע�ͣ��������κγ�Ա�����������ɴ���Ԫ����
public @interface Testable
{}