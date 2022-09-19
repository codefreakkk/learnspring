package learnspring.springJDBC;

import learnspring.springJDBC.dao.StudentDao;
import learnspring.springJDBC.dao.StudentDaoImpl;
import learnspring.springJDBC.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {

        // create object of jdbc template class
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/learnspring/springJDBC/config.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
//        // insert query
//        String query = "INSERT into student (name, address) values (?, ?)";
        // query
//        int result = template.update(query, "harsh", "solapur");
//        System.out.println(result + "rows affected");


        // insert query using a design pattern
        StudentDaoImpl stdDaoImp = context.getBean("StudentDaoImpl", StudentDaoImpl.class);
//        System.out.println(stdDaoImp.insert(new Student("prachi", "solapur")));

        // update query using a design pattern
        System.out.println(stdDaoImp.change(new Student(1, "gangubai", "badliwali")));
    }
}
