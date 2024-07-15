package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop", Desktop.class);
        dt.compile();
        //to create a container
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Xiangyang obj1 =  context.getBean("Xiangyang", Xiangyang.class);
//        obj1.setAge(30);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Xiangyang obj2 = (Xiangyang) context.getBean("Xiangyang");
//        System.out.println(obj2.getAge());
//        obj2.code();

  //      Desktop obj = context.getBean("com1", Desktop.class);

    }
}
