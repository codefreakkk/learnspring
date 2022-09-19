package learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/configuration.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student.getName());
        System.out.println(student.getId());
    }
}


