package learnspring.springJDBC.dao;

import learnspring.springJDBC.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Component("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    @Qualifier("JdbcTemplate")
    private JdbcTemplate template;

    @Override
    public int insert(Student student) {
        String query = "INSERT into student (name, address) values (?, ?)";
        return this.template.update(query, student.getName(), student.getAddress());
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public int change(Student student) {
        String query = "UPDATE student SET name=?, address=? WHERE id=?";
        return this.template.update(query, student.getName(), student.getAddress(), student.getId());
    }

    @Override
    public List<Student> getAllStudents(Student student) {
        String query = "SELECT * FROM student";
        return this.template.query(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
                return student;
            }
        });
    }

    public JdbcTemplate getTemplate() {
        return template;
    }
}
