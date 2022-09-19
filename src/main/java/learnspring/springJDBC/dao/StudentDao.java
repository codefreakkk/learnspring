package learnspring.springJDBC.dao;

import learnspring.springJDBC.entities.Student;

public interface StudentDao {
    // insert data
    public int insert(Student student);

    // update data
    public int change(Student student);
}
