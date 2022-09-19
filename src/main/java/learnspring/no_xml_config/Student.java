package learnspring.no_xml_config;

import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
    public void study() {
        System.out.println("reading");
    }
}
