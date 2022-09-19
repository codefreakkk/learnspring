package learnspring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/learnspring/Autowiring/autowiring_configuration.xml");
        Emp emp = (Emp) context.getBean("Emp", Emp.class);
        System.out.println(emp);
    }
}
