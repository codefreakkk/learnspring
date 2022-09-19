package learnspring.no_xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student stud = context.getBean("stud", Student.class);
//        stud.study();

        // emp class with java config
        Emp emp = context.getBean("getEmp", Emp.class);
        emp.work();
    }
}
