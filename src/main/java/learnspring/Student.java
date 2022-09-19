package learnspring;

import javax.annotation.PostConstruct;
import java.util.List;

public class Student {
    private String name;
    List<Integer> id;

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // init method annotation
    @PostConstruct
    public void start() {
        System.out.println("init method called");
    }
}
