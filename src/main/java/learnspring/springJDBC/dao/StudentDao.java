package learnspring.springJDBC.dao;

import learnspring.springJDBC.entities.Student;

import java.util.List;

public interface StudentDao {
    // insert data
    public int insert(Student student);
    // update data
    public int change(Student student);
    // select multiple rows
    public List<Student> getAllStudents(Student student);
}
