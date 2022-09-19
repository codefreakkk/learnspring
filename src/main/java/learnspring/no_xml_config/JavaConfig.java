package learnspring.no_xml_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this annotation tells that this class is configuration class
@Configuration
// this annotation tells which package to scan
@ComponentScan(basePackages = "learnspring.no_xml_config")
public class JavaConfig {

    @Bean
    public Address getAddress() {
        return new Address();
    }

    // this object is passed to IOC container
    @Bean
    public Emp getEmp() {
        // create a new object
        Emp emp = new Emp();
        return emp;
    }
}
