package learnspring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/learnspring/stereotype/ste.xml");
        Student std = context.getBean("myBean", Student.class);
        System.out.println(std.getId());
        System.out.println(std.getName());
    }
}
