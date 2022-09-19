package learnspring.springJDBC.dao;

import learnspring.springJDBC.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate template;

    @Override
    public int insert(Student student) {
        String query = "INSERT into student (name, address) values (?, ?)";
        return this.template.update(query, student.getName(), student.getAddress());
    }

    @Override
    public int change(Student student) {
        String query = "UPDATE student SET name=?, address=? WHERE id=?";
        return this.template.update(query, student.getName(), student.getAddress(), student.getId());
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
