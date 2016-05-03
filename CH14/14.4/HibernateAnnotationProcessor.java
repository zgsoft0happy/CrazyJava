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
import javax.annotation.processing.*;
import java.util.*;
import javax.lang.model.element.*;
import javax.lang.model.*;
import java.io.*;
@SupportedSourceVersion(SourceVersion.RELEASE_7)
//ָ���ɴ���@Persistent��@Id��@Property����Annotation
@SupportedAnnotationTypes({"Persistent" , "Id" , "Property"})
public class HibernateAnnotationProcessor extends AbstractProcessor
{
	//ѭ������ÿ����Ҫ����ĳ������
	public boolean process(Set<? extends TypeElement> annotations , RoundEnvironment roundEnv)
	{
		//����һ���ļ���������������ɶ�����ļ�
		PrintStream ps = null;
		try
		{
			//����ÿ����@Persistent���ε�class�ļ�
			for (Element t : roundEnv.getElementsAnnotatedWith(Persistent.class))
			{
				//��ȡ���ڴ��������
				Name clazzName = t.getSimpleName();
				//��ȡ�ඨ��ǰ��@Persistent Annotation
				Persistent per = t.getAnnotation(Persistent.class);
				//�����ʼ������
				ps = new PrintStream(new FileOutputStream(clazzName + ".hbm.xml"));
				//ִ�����
				ps.println("<?xml version=\"1.0\"?>");
				ps.println("<!DOCTYPE hibernate-mapping PUBLIC");
				ps.println("  \"-//Hibernate/Hibernate " + "Mapping DTD 3.0//EN\"");
				ps.println("  \"http://www.hibernate.org/dtd/" + "hibernate-mapping-3.0.dtd\">");
				ps.println("<hibernate-mapping>");
				ps.print("<class name=\"" + t);
				//���per��table()��ֵ
				ps.println("\" table =\"" + per.table() + "\">");
				for (Element f : t.getEnclosedElements())
				{
					//ֻ����Field�ϵ�Annotation
					if (f.getKind()== ElementKind.FIELD)		//1
					{
						//��ȡField����ǰ��@Id Annotation
						Id id= f.getAnnotation(Id.class);	//2
						//��@Id Annotation����ʱ���<id.../>Ԫ��
						if (id != null)
						{
							ps.println("   <id name=\"" + f.getSimpleName() + "\" column=\"" + id.column()
								+ "\" type=\"" +id.type() + "\">");
								ps.println("		<geneterator class=\"" + id.generator() + "\"/>");
								ps.println("		</id>");
						}
						//��ȡField����ǰ��@Property Annotation
						Property p = f.getAnnotation(Property.class);	//3
						//��@Property Annotation����ʱ���<property.../>Ԫ��
						if (p != null)
						{
							ps.println("		<property name=\"" + f.getSimpleName() + "\" column=\"" 
								+ p.column() +"\" type=\"" + p.type() +"\"/>");
						}
					}
				}
				ps.println("	</class>");
				ps.println("</hibernate-mapping>");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (ps != null)
			{
				try
				{
					ps.close();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		return true;
	}
}