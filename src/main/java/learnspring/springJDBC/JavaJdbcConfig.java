package learnspring.springJDBC;

import learnspring.springJDBC.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"learnspring.springJDBC.dao"})
public class JavaJdbcConfig {

    @Bean("datasource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/emp");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
    }

    @Bean("JdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("StudentDaoImpl")
//    public StudentDaoImpl getStudentDaoImpl() {
//        return new StudentDaoImpl();
//    }
}
